// Generated by view binder compiler. Do not edit!
package com.example.icooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.icooking.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeListItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CheckBox buyname;

  @NonNull
  public final LinearLayout lowerview;

  private HomeListItemBinding(@NonNull RelativeLayout rootView, @NonNull CheckBox buyname,
      @NonNull LinearLayout lowerview) {
    this.rootView = rootView;
    this.buyname = buyname;
    this.lowerview = lowerview;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buyname;
      CheckBox buyname = rootView.findViewById(id);
      if (buyname == null) {
        break missingId;
      }

      id = R.id.lowerview;
      LinearLayout lowerview = rootView.findViewById(id);
      if (lowerview == null) {
        break missingId;
      }

      return new HomeListItemBinding((RelativeLayout) rootView, buyname, lowerview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}