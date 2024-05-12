package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;

/* renamed from: X.VYo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79930VYo {
    public final View LIZ;
    public final C79762VSc LIZIZ;
    public final C79762VSc LIZJ;
    public final C79762VSc LIZLLL;
    public Calendar LJ;
    public Calendar LJFF;
    public Calendar LJI;

    public final void LIZ(Calendar calendar) {
        int i;
        int i2;
        int i3;
        if (calendar.getTimeInMillis() < this.LJ.getTimeInMillis()) {
            Calendar calendar2 = this.LJ;
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
        } else if (calendar.getTimeInMillis() > this.LJFF.getTimeInMillis()) {
            Calendar calendar3 = this.LJFF;
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(calendar3.getTimeInMillis());
        }
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        int i7 = this.LJ.get(11);
        int i8 = this.LJ.get(12);
        int i9 = this.LJ.get(13);
        int i10 = this.LJFF.get(11);
        int i11 = this.LJFF.get(12);
        int i12 = this.LJFF.get(13);
        if (i7 == i10) {
            this.LIZIZ.setAdapter(new VZ1(i7, i10));
            i3 = i4 - i7;
            this.LIZJ.setAdapter(new VZ1(i8, i11));
            i2 = i5 - i8;
            if (i8 == i11) {
                this.LIZLLL.setAdapter(new VZ1(i9, i12));
            } else if (i5 == i8) {
                this.LIZLLL.setAdapter(new VZ1(i9, 59));
            } else if (i5 == i11) {
                this.LIZLLL.setAdapter(new VZ1(0, i12));
            } else {
                this.LIZLLL.setAdapter(new VZ1(0, 59));
            }
            i6 -= i9;
        } else {
            if (i7 < i10) {
                this.LIZIZ.setAdapter(new VZ1(i7, i10));
                i = i4 - i7;
            } else {
                this.LIZIZ.setAdapter(new VZ2(i7, i10));
                i = i4 - i7;
                if (i < 0) {
                    i += 24;
                }
            }
            if (i4 == i7) {
                this.LIZJ.setAdapter(new VZ1(i8, 59));
                int i13 = i5 - i8;
                if (i5 == i8) {
                    this.LIZLLL.setAdapter(new VZ1(i9, 59));
                    i6 -= i9;
                } else {
                    this.LIZLLL.setAdapter(new VZ1(0, 59));
                }
                i5 = i13;
            } else if (i4 == i10) {
                this.LIZJ.setAdapter(new VZ1(0, i11));
                if (i5 == i11) {
                    this.LIZLLL.setAdapter(new VZ1(0, i12));
                } else {
                    this.LIZLLL.setAdapter(new VZ1(0, 59));
                }
            } else {
                this.LIZJ.setAdapter(new VZ1(0, 59));
                this.LIZLLL.setAdapter(new VZ1(0, 59));
            }
            i2 = i5;
            i3 = i;
        }
        this.LJI = calendar;
        this.LIZIZ.setCurrentIndex(i3);
        this.LIZJ.setCurrentIndex(i2);
        this.LIZLLL.setCurrentIndex(i6);
    }

    public C79930VYo(View view, boolean[] zArr, InterfaceC58352MvE interfaceC58352MvE) {
        int i;
        int i2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 0, 0, 0);
        this.LJ = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 23, 59, 59);
        this.LJFF = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1);
        this.LJI = calendar3;
        this.LIZ = view;
        C79762VSc c79762VSc = (C79762VSc) view.findViewById(R.id.e86);
        this.LIZIZ = c79762VSc;
        C79762VSc c79762VSc2 = (C79762VSc) view.findViewById(R.id.gjj);
        this.LIZJ = c79762VSc2;
        C79762VSc c79762VSc3 = (C79762VSc) view.findViewById(R.id.jil);
        this.LIZLLL = c79762VSc3;
        c79762VSc.setLocalizeAdapter(interfaceC58352MvE);
        c79762VSc2.setLocalizeAdapter(interfaceC58352MvE);
        c79762VSc3.setLocalizeAdapter(interfaceC58352MvE);
        c79762VSc.setGravity(17);
        c79762VSc2.setGravity(17);
        c79762VSc3.setGravity(17);
        if (zArr.length == 3) {
            if (zArr[0]) {
                i = 0;
            } else {
                i = 8;
            }
            c79762VSc.setVisibility(i);
            if (zArr[1]) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c79762VSc2.setVisibility(i2);
            c79762VSc3.setVisibility(zArr[2] ? 0 : 8);
            float f = 18;
            c79762VSc.setTextSize(f);
            c79762VSc2.setTextSize(f);
            c79762VSc3.setTextSize(f);
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
