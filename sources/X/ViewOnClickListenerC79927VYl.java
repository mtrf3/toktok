package X;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.VYl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC79927VYl extends AbstractC79941VYz implements View.OnClickListener {
    public C79929VYn LJLL;
    public final C79935VYt LJLLI;

    @Override // X.AbstractC79941VYz
    public final void LJ() {
        this.LJLLI.getClass();
    }

    @Override // X.AbstractC79941VYz
    public final C79924VYi LJFF() {
        return this.LJLLI;
    }

    public ViewOnClickListenerC79927VYl(C79935VYt c79935VYt) {
        super(c79935VYt.LIZJ);
        String str;
        String str2;
        int i;
        int i2;
        this.LJLLI = c79935VYt;
        Context context = c79935VYt.LIZJ;
        Dialog dialog = this.LJLJJL;
        if (dialog != null) {
            LJFF().getClass();
            dialog.setCancelable(true);
        }
        LIZLLL();
        LIZJ();
        C16880lQ.LLLZIIL(R.layout.brj, C16880lQ.LLZIL(context), this.LJLILLLLZI);
        TextView textView = (TextView) LIZIZ(R.id.lyc);
        View LIZIZ = LIZIZ(R.id.j_p);
        Button button = (Button) LIZIZ(R.id.auf);
        Button button2 = (Button) LIZIZ(R.id.au6);
        button.setTag("submit");
        button2.setTag("cancel");
        C16880lQ.LJIILIIL(button, this);
        C16880lQ.LJIILIIL(button2, this);
        java.util.Map<String, String> LIZ = c79935VYt.LJIIZILJ.LIZ();
        if (TextUtils.isEmpty(null)) {
            str = LIZ.get("confirm");
        } else {
            str = null;
        }
        button.setText(str);
        button2.setText(TextUtils.isEmpty(null) ? LIZ.get("cancel") : null);
        if (TextUtils.isEmpty(c79935VYt.LIZLLL)) {
            str2 = "";
        } else {
            str2 = c79935VYt.LIZLLL;
        }
        textView.setText(str2);
        button.setTextColor(c79935VYt.LJ);
        button2.setTextColor(c79935VYt.LJFF);
        textView.setTextColor(c79935VYt.LJI);
        LIZIZ.setBackgroundColor(-657931);
        float f = 17;
        button.setTextSize(f);
        button2.setTextSize(f);
        textView.setTextSize(c79935VYt.LJII);
        View LIZIZ2 = LIZIZ(R.id.c3o);
        LIZIZ2.setBackgroundColor(-1);
        this.LJLL = new C79929VYn(LIZIZ2, c79935VYt.LJIIL, c79935VYt.LJIIZILJ);
        if (c79935VYt.LJIILL == null) {
            Calendar calendar = Calendar.getInstance();
            c79935VYt.LJIILL = calendar;
            calendar.set(1900, 0, 1);
        }
        if (c79935VYt.LJIILLIIL == null) {
            Calendar calendar2 = Calendar.getInstance();
            c79935VYt.LJIILLIIL = calendar2;
            calendar2.set(2100, 11, 31);
        }
        if (c79935VYt.LJIILL.get(1) < 1900 || c79935VYt.LJIILL.get(1) > 2100) {
            c79935VYt.LJIILL.set(1900, 0, 1);
        }
        if (c79935VYt.LJIILLIIL.get(1) < 1900 || c79935VYt.LJIILLIIL.get(1) > 2100) {
            c79935VYt.LJIILLIIL.set(2100, 11, 31);
        }
        C79929VYn c79929VYn = this.LJLL;
        Calendar calendar3 = c79935VYt.LJIILL;
        Calendar calendar4 = c79935VYt.LJIILLIIL;
        c79929VYn.getClass();
        if (calendar3 == null) {
            if (calendar4 != null) {
                int i3 = calendar4.get(1);
                int i4 = calendar4.get(2) + 1;
                int i5 = calendar4.get(5);
                int i6 = c79929VYn.LJ;
                if (i3 > i6) {
                    c79929VYn.LJFF = i3;
                    c79929VYn.LJII = i4;
                    c79929VYn.LJIIIZ = i5;
                } else if (i3 == i6) {
                    int i7 = c79929VYn.LJI;
                    if (i4 > i7) {
                        c79929VYn.LJFF = i3;
                        c79929VYn.LJII = i4;
                        c79929VYn.LJIIIZ = i5;
                    } else if (i4 == i7 && i5 > c79929VYn.LJIIIIZZ) {
                        c79929VYn.LJFF = i3;
                        c79929VYn.LJII = i4;
                        c79929VYn.LJIIIZ = i5;
                    }
                }
            }
        } else if (calendar4 == null) {
            int i8 = calendar3.get(1);
            int i9 = calendar3.get(2) + 1;
            int i10 = calendar3.get(5);
            int i11 = c79929VYn.LJFF;
            if (i8 < i11) {
                c79929VYn.LJI = i9;
                c79929VYn.LJIIIIZZ = i10;
                c79929VYn.LJ = i8;
            } else if (i8 == i11) {
                int i12 = c79929VYn.LJII;
                if (i9 < i12) {
                    c79929VYn.LJI = i9;
                    c79929VYn.LJIIIIZZ = i10;
                    c79929VYn.LJ = i8;
                } else if (i9 == i12 && i10 < c79929VYn.LJIIIZ) {
                    c79929VYn.LJI = i9;
                    c79929VYn.LJIIIIZZ = i10;
                    c79929VYn.LJ = i8;
                }
            }
        } else {
            c79929VYn.LJ = calendar3.get(1);
            c79929VYn.LJFF = calendar4.get(1);
            c79929VYn.LJI = calendar3.get(2) + 1;
            c79929VYn.LJII = calendar4.get(2) + 1;
            c79929VYn.LJIIIIZZ = calendar3.get(5);
            c79929VYn.LJIIIZ = calendar4.get(5);
        }
        if (c79935VYt.LJIILL != null && c79935VYt.LJIILLIIL != null) {
            if (c79935VYt.LJIILJJIL == null) {
                c79935VYt.LJIILJJIL = Calendar.getInstance();
            }
            if (c79935VYt.LJIILJJIL.getTimeInMillis() < c79935VYt.LJIILL.getTimeInMillis()) {
                c79935VYt.LJIILJJIL.setTimeInMillis(c79935VYt.LJIILL.getTimeInMillis());
            }
            if (c79935VYt.LJIILJJIL.getTimeInMillis() > c79935VYt.LJIILLIIL.getTimeInMillis()) {
                c79935VYt.LJIILJJIL.setTimeInMillis(c79935VYt.LJIILLIIL.getTimeInMillis());
            }
            int i13 = c79935VYt.LJIILJJIL.get(1);
            int i14 = c79935VYt.LJIILJJIL.get(2) + 1;
            int i15 = c79935VYt.LJIILJJIL.get(5);
            C79929VYn c79929VYn2 = this.LJLL;
            c79929VYn2.LJIIJ = i13;
            c79929VYn2.LJIIJJI = i14;
            c79929VYn2.LJIIL = i15;
            c79929VYn2.LIZIZ.setAdapter(new VZ1(c79929VYn2.LJ, c79929VYn2.LJFF));
            c79929VYn2.LIZIZ.setCurrentIndex(i13 - c79929VYn2.LJ);
            int i16 = c79929VYn2.LJ;
            int i17 = c79929VYn2.LJFF;
            if (i16 == i17) {
                i = c79929VYn2.LJI;
                i2 = c79929VYn2.LJII;
            } else {
                if (i13 == i16) {
                    i = c79929VYn2.LJI;
                } else if (i13 == i17) {
                    i2 = c79929VYn2.LJII;
                    i = 1;
                } else {
                    i = 1;
                }
                i2 = 12;
            }
            c79929VYn2.LIZJ.setAdapter(new VZ1(i, i2));
            c79929VYn2.LIZJ.setCurrentIndex(i14 - i);
            c79929VYn2.LIZJ(i13, i14, i15, true);
            this.LJLL.getClass();
            C79929VYn c79929VYn3 = this.LJLL;
            c79929VYn3.LIZIZ.setTextXOffset(0);
            c79929VYn3.LIZJ.setTextXOffset(0);
            c79929VYn3.LIZLLL.setTextXOffset(0);
            C79929VYn c79929VYn4 = this.LJLL;
            int i18 = c79935VYt.LJIIJ;
            c79929VYn4.LIZLLL.setItemsVisibleCount(i18);
            c79929VYn4.LIZJ.setItemsVisibleCount(i18);
            c79929VYn4.LIZIZ.setItemsVisibleCount(i18);
            C79929VYn c79929VYn5 = this.LJLL;
            c79929VYn5.LIZLLL.setAlphaGradient(false);
            c79929VYn5.LIZJ.setAlphaGradient(false);
            c79929VYn5.LIZIZ.setAlphaGradient(false);
            LJI();
            C79929VYn c79929VYn6 = this.LJLL;
            c79929VYn6.LIZIZ.setCyclic(false);
            c79929VYn6.LIZJ.setCyclic(false);
            c79929VYn6.LIZLLL.setCyclic(false);
            C79929VYn c79929VYn7 = this.LJLL;
            c79929VYn7.LIZLLL.setDividerColor(-2763307);
            c79929VYn7.LIZJ.setDividerColor(-2763307);
            c79929VYn7.LIZIZ.setDividerColor(-2763307);
            C79929VYn c79929VYn8 = this.LJLL;
            VK0 vk0 = c79935VYt.LJIIIZ;
            c79929VYn8.LIZLLL.setDividerType(vk0);
            c79929VYn8.LIZJ.setDividerType(vk0);
            c79929VYn8.LIZIZ.setDividerType(vk0);
            C79929VYn c79929VYn9 = this.LJLL;
            c79929VYn9.LIZLLL.setLineSpacingMultiplier(1.6f);
            c79929VYn9.LIZJ.setLineSpacingMultiplier(1.6f);
            c79929VYn9.LIZIZ.setLineSpacingMultiplier(1.6f);
            C79929VYn c79929VYn10 = this.LJLL;
            c79929VYn10.LIZLLL.setTextColorOut(-5723992);
            c79929VYn10.LIZJ.setTextColorOut(-5723992);
            c79929VYn10.LIZIZ.setTextColorOut(-5723992);
            C79929VYn c79929VYn11 = this.LJLL;
            c79929VYn11.LIZLLL.setTextColorCenter(-14013910);
            c79929VYn11.LIZJ.setTextColorCenter(-14013910);
            c79929VYn11.LIZIZ.setTextColorCenter(-14013910);
            C79929VYn c79929VYn12 = this.LJLL;
            c79929VYn12.LIZLLL.LJLJL = false;
            c79929VYn12.LIZJ.LJLJL = false;
            c79929VYn12.LIZIZ.LJLJL = false;
            return;
        }
        throw new IllegalStateException("you should call setRangDate() first");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String LLLZI;
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            VZ5 vz5 = this.LJLLI.LJIIJJI;
            if (vz5 != null) {
                C79929VYn c79929VYn = this.LJLL;
                c79929VYn.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.set(c79929VYn.LJIIJ, c79929VYn.LJIIJJI - 1, c79929VYn.LJIIL);
                String str2 = this.LJLLI.LJIJ;
                if (str2 == null) {
                    str2 = "-";
                }
                int i = calendar.get(1);
                int i2 = calendar.get(2) + 1;
                int i3 = calendar.get(5);
                boolean[] zArr = this.LJLLI.LJIIL;
                if (zArr.length != 3) {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%04d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), str2, Integer.valueOf(i3)});
                } else if (zArr[2]) {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%04d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), str2, Integer.valueOf(i3)});
                } else if (zArr[1]) {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%04d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)});
                } else {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%04d", new Object[]{Integer.valueOf(i)});
                }
                vz5.LIZ(LLLZI);
            }
            this.LJLJL = true;
        } else if (str.equals("cancel")) {
            InterfaceC79926VYk interfaceC79926VYk = this.LJLLI.LIZ;
            if (interfaceC79926VYk != null) {
                interfaceC79926VYk.onCancel();
            }
            this.LJLJL = true;
        }
        LIZ();
    }
}
