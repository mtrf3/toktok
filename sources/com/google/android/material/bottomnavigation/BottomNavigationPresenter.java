package com.google.android.material.bottomnavigation;

import X.C02O;
import X.C03510Bv;
import X.C281318n;
import X.C281618q;
import X.C80274Vew;
import X.C80279Vf1;
import X.C80418VhG;
import X.SubMenuC39851hN;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes15.dex */
public final class BottomNavigationPresenter implements C02O {
    public C80274Vew LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;

    @Override // X.C02O
    public final void LIZ(C281318n c281318n, boolean z) {
    }

    @Override // X.C02O
    public final boolean LJ(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJFF(SubMenuC39851hN subMenuC39851hN) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJI(C281618q c281618q) {
        return false;
    }

    @Override // X.C02O
    public final boolean LJII() {
        return false;
    }

    @Override // X.C02O
    public final Parcelable LIZIZ() {
        SavedState savedState = new SavedState();
        savedState.LJLIL = this.LJLIL.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.LJLIL.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            BadgeDrawable valueAt = badgeDrawables.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.LJLJLJ);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        savedState.LJLILLLLZI = parcelableSparseArray;
        return savedState;
    }

    /* loaded from: classes15.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80279Vf1();
        public int LJLIL;
        public ParcelableSparseArray LJLILLLLZI;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LJLIL);
            parcel.writeParcelable(this.LJLILLLLZI, 0);
        }
    }

    @Override // X.C02O
    public final int getId() {
        return this.LJLJI;
    }

    @Override // X.C02O
    public final void LIZJ(boolean z) {
        boolean z2;
        if (this.LJLILLLLZI) {
            return;
        }
        if (z) {
            this.LJLIL.LIZIZ();
            return;
        }
        C80274Vew c80274Vew = this.LJLIL;
        C281318n c281318n = c80274Vew.LLFII;
        if (c281318n == null || c80274Vew.LJLLILLLL == null) {
            return;
        }
        int size = c281318n.size();
        if (size != c80274Vew.LJLLILLLL.length) {
            c80274Vew.LIZIZ();
            return;
        }
        int i = c80274Vew.LJLLJ;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = c80274Vew.LLFII.getItem(i2);
            if (item.isChecked()) {
                c80274Vew.LJLLJ = item.getItemId();
                c80274Vew.LJLLL = i2;
            }
        }
        if (i != c80274Vew.LJLLJ) {
            C03510Bv.LIZ(c80274Vew, c80274Vew.LJLIL);
        }
        int i3 = c80274Vew.LJLLI;
        int size2 = c80274Vew.LLFII.LJIIJJI().size();
        if (i3 != -1 ? i3 == 0 : size2 > 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            c80274Vew.LLFFF.LJLILLLLZI = true;
            c80274Vew.LJLLILLLL[i4].setLabelVisibilityMode(c80274Vew.LJLLI);
            c80274Vew.LJLLILLLL[i4].setShifting(z2);
            c80274Vew.LJLLILLLL[i4].LJIIIIZZ((C281618q) c80274Vew.LLFII.getItem(i4));
            c80274Vew.LLFFF.LJLILLLLZI = false;
        }
    }

    @Override // X.C02O
    public final void LJIIJ(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            C80274Vew c80274Vew = this.LJLIL;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.LJLIL;
            int size = c80274Vew.LLFII.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = c80274Vew.LLFII.getItem(i2);
                if (i == item.getItemId()) {
                    c80274Vew.LJLLJ = i;
                    c80274Vew.LJLLL = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.LJLIL.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.LJLILLLLZI;
            SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int keyAt = parcelableSparseArray.keyAt(i3);
                BadgeDrawable.SavedState savedState2 = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i3);
                if (savedState2 != null) {
                    BadgeDrawable badgeDrawable = new BadgeDrawable(context);
                    badgeDrawable.LJII(savedState2.maxCharacterCount);
                    int i4 = savedState2.number;
                    if (i4 != -1) {
                        int max = Math.max(0, i4);
                        BadgeDrawable.SavedState savedState3 = badgeDrawable.LJLJLJ;
                        if (savedState3.number != max) {
                            savedState3.number = max;
                            badgeDrawable.LJLJI.LIZLLL = true;
                            badgeDrawable.LJIIIZ();
                            badgeDrawable.invalidateSelf();
                        }
                    }
                    int i5 = savedState2.backgroundColor;
                    badgeDrawable.LJLJLJ.backgroundColor = i5;
                    ColorStateList valueOf = ColorStateList.valueOf(i5);
                    C80418VhG c80418VhG = badgeDrawable.LJLILLLLZI;
                    if (c80418VhG.LJLIL.LIZJ != valueOf) {
                        c80418VhG.LJIIJJI(valueOf);
                        badgeDrawable.invalidateSelf();
                    }
                    int i6 = savedState2.badgeTextColor;
                    badgeDrawable.LJLJLJ.badgeTextColor = i6;
                    if (badgeDrawable.LJLJI.LIZ.getColor() != i6) {
                        badgeDrawable.LJLJI.LIZ.setColor(i6);
                        badgeDrawable.invalidateSelf();
                    }
                    badgeDrawable.LJI(savedState2.badgeGravity);
                    badgeDrawable.LJLJLJ.horizontalOffset = savedState2.horizontalOffset;
                    badgeDrawable.LJIIIZ();
                    badgeDrawable.LJLJLJ.verticalOffset = savedState2.verticalOffset;
                    badgeDrawable.LJIIIZ();
                    boolean z = savedState2.isVisible;
                    badgeDrawable.setVisible(z, false);
                    badgeDrawable.LJLJLJ.isVisible = z;
                    sparseArray.put(keyAt, badgeDrawable);
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            this.LJLIL.setBadgeDrawables(sparseArray);
        }
    }

    @Override // X.C02O
    public final void LJIIIIZZ(Context context, C281318n c281318n) {
        this.LJLIL.LLFII = c281318n;
    }
}
