// Generated by view binder compiler. Do not edit!
package com.example.icooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.icooking.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottonSheetDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final EditText etIngredientName;

  @NonNull
  public final EditText etLeftDay;

  @NonNull
  public final DatePicker expiryDate;

  @NonNull
  public final TextView expiryDateText;

  @NonNull
  public final TextView testIngredient;

  private BottonSheetDialogBinding(@NonNull LinearLayout rootView, @NonNull Button btnSubmit,
      @NonNull EditText etIngredientName, @NonNull EditText etLeftDay,
      @NonNull DatePicker expiryDate, @NonNull TextView expiryDateText,
      @NonNull TextView testIngredient) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.etIngredientName = etIngredientName;
    this.etLeftDay = etLeftDay;
    this.expiryDate = expiryDate;
    this.expiryDateText = expiryDateText;
    this.testIngredient = testIngredient;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottonSheetDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottonSheetDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.botton_sheet_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottonSheetDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_submit;
      Button btnSubmit = rootView.findViewById(id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.et_ingredientName;
      EditText etIngredientName = rootView.findViewById(id);
      if (etIngredientName == null) {
        break missingId;
      }

      id = R.id.et_leftDay;
      EditText etLeftDay = rootView.findViewById(id);
      if (etLeftDay == null) {
        break missingId;
      }

      id = R.id.expiryDate;
      DatePicker expiryDate = rootView.findViewById(id);
      if (expiryDate == null) {
        break missingId;
      }

      id = R.id.expiryDate_text;
      TextView expiryDateText = rootView.findViewById(id);
      if (expiryDateText == null) {
        break missingId;
      }

      id = R.id.test_ingredient;
      TextView testIngredient = rootView.findViewById(id);
      if (testIngredient == null) {
        break missingId;
      }

      return new BottonSheetDialogBinding((LinearLayout) rootView, btnSubmit, etIngredientName,
          etLeftDay, expiryDate, expiryDateText, testIngredient);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
