package X;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.VYm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC79928VYm extends AbstractC79941VYz implements View.OnClickListener {
    public C79930VYo LJLL;
    public final C79935VYt LJLLI;

    @Override // X.AbstractC79941VYz
    public final void LJ() {
        this.LJLLI.getClass();
    }

    @Override // X.AbstractC79941VYz
    public final C79924VYi LJFF() {
        return this.LJLLI;
    }

    public ViewOnClickListenerC79928VYm(C79935VYt c79935VYt) {
        super(c79935VYt.LIZJ);
        String str;
        String str2;
        this.LJLLI = c79935VYt;
        Context context = c79935VYt.LIZJ;
        Dialog dialog = this.LJLJJL;
        if (dialog != null) {
            LJFF().getClass();
            dialog.setCancelable(true);
        }
        LIZLLL();
        LIZJ();
        C16880lQ.LLLZIIL(R.layout.brl, C16880lQ.LLZIL(context), this.LJLILLLLZI);
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
        View LIZIZ2 = LIZIZ(R.id.l88);
        LIZIZ2.setBackgroundColor(-1);
        C79930VYo c79930VYo = new C79930VYo(LIZIZ2, c79935VYt.LJIILIIL, c79935VYt.LJIIZILJ);
        this.LJLL = c79930VYo;
        Calendar calendar = c79935VYt.LJIILL;
        Calendar calendar2 = c79935VYt.LJIILLIIL;
        calendar = calendar == null ? Calendar.getInstance() : calendar;
        calendar2 = calendar2 == null ? Calendar.getInstance() : calendar2;
        calendar.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1);
        calendar2.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1);
        if (calendar.getTimeInMillis() > calendar2.getTimeInMillis()) {
            calendar2.add(5, 1);
        }
        c79930VYo.LIZIZ.setAdapter(new VZ2(calendar.get(11), calendar2.get(11)));
        c79930VYo.LIZJ.setAdapter(new VZ1(0, 59));
        c79930VYo.LIZLLL.setAdapter(new VZ1(0, 59));
        c79930VYo.LJ = calendar;
        c79930VYo.LJFF = calendar2;
        c79930VYo.LIZIZ.setOnItemSelectedListener(new C79936VYu(c79930VYo));
        c79930VYo.LIZJ.setOnItemSelectedListener(new C79937VYv(c79930VYo));
        c79930VYo.LIZLLL.setOnItemSelectedListener(new C79938VYw(c79930VYo));
        Calendar calendar3 = c79935VYt.LJIILJJIL;
        C79930VYo c79930VYo2 = this.LJLL;
        if (c79930VYo2.LJ != null && c79930VYo2.LJFF != null) {
            calendar3 = calendar3 == null ? Calendar.getInstance() : calendar3;
            calendar3.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1);
            c79930VYo2.LIZ(calendar3);
        }
        this.LJLL.getClass();
        C79930VYo c79930VYo3 = this.LJLL;
        c79930VYo3.LIZIZ.setTextXOffset(0);
        c79930VYo3.LIZJ.setTextXOffset(0);
        c79930VYo3.LIZLLL.setTextXOffset(0);
        C79930VYo c79930VYo4 = this.LJLL;
        int i = c79935VYt.LJIIJ;
        c79930VYo4.LIZIZ.setItemsVisibleCount(i);
        c79930VYo4.LIZJ.setItemsVisibleCount(i);
        c79930VYo4.LIZLLL.setItemsVisibleCount(i);
        C79930VYo c79930VYo5 = this.LJLL;
        c79930VYo5.LIZIZ.setAlphaGradient(false);
        c79930VYo5.LIZJ.setAlphaGradient(false);
        c79930VYo5.LIZLLL.setAlphaGradient(false);
        LJI();
        C79930VYo c79930VYo6 = this.LJLL;
        c79930VYo6.LIZIZ.setCyclic(false);
        c79930VYo6.LIZJ.setCyclic(false);
        c79930VYo6.LIZLLL.setCyclic(false);
        C79930VYo c79930VYo7 = this.LJLL;
        c79930VYo7.LIZIZ.setDividerColor(-2763307);
        c79930VYo7.LIZJ.setDividerColor(-2763307);
        c79930VYo7.LIZLLL.setDividerColor(-2763307);
        C79930VYo c79930VYo8 = this.LJLL;
        VK0 vk0 = c79935VYt.LJIIIZ;
        c79930VYo8.LIZIZ.setDividerType(vk0);
        c79930VYo8.LIZJ.setDividerType(vk0);
        c79930VYo8.LIZLLL.setDividerType(vk0);
        C79930VYo c79930VYo9 = this.LJLL;
        c79930VYo9.LIZIZ.setLineSpacingMultiplier(1.6f);
        c79930VYo9.LIZJ.setLineSpacingMultiplier(1.6f);
        c79930VYo9.LIZLLL.setLineSpacingMultiplier(1.6f);
        C79930VYo c79930VYo10 = this.LJLL;
        c79930VYo10.LIZIZ.setTextColorOut(-5723992);
        c79930VYo10.LIZJ.setTextColorOut(-5723992);
        c79930VYo10.LIZLLL.setTextColorOut(-5723992);
        C79930VYo c79930VYo11 = this.LJLL;
        c79930VYo11.LIZIZ.setTextColorCenter(-14013910);
        c79930VYo11.LIZJ.setTextColorCenter(-14013910);
        c79930VYo11.LIZLLL.setTextColorCenter(-14013910);
        C79930VYo c79930VYo12 = this.LJLL;
        c79930VYo12.LIZIZ.LJLJL = false;
        c79930VYo12.LIZJ.LJLJL = false;
        c79930VYo12.LIZLLL.LJLJL = false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String LLLZI;
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            C79935VYt c79935VYt = this.LJLLI;
            VZ5 vz5 = c79935VYt.LJIIJJI;
            if (vz5 != null) {
                String str2 = c79935VYt.LJIJ;
                if (str2 == null) {
                    str2 = ":";
                }
                boolean[] zArr = c79935VYt.LJIILIIL;
                Calendar calendar = this.LJLL.LJI;
                int i = calendar.get(11);
                int i2 = calendar.get(12);
                int i3 = calendar.get(13);
                if (zArr == null || zArr.length != 3) {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%02d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), str2, Integer.valueOf(i3)});
                } else if (zArr[2]) {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%02d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), str2, Integer.valueOf(i3)});
                } else if (zArr[1]) {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)});
                } else {
                    LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i)});
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
