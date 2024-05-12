package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VYh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC79923VYh extends AbstractC79941VYz implements View.OnClickListener {
    public VIB LJLL;
    public final C79925VYj LJLLI;

    @Override // X.AbstractC79941VYz
    public final void LJ() {
        this.LJLLI.getClass();
    }

    @Override // X.AbstractC79941VYz
    public final C79924VYi LJFF() {
        return this.LJLLI;
    }

    public ViewOnClickListenerC79923VYh(C79925VYj c79925VYj) {
        super(c79925VYj.LIZJ);
        String str;
        String str2;
        String str3;
        this.LJLLI = c79925VYj;
        Context context = c79925VYj.LIZJ;
        Dialog dialog = this.LJLJJL;
        if (dialog != null) {
            LJFF().getClass();
            dialog.setCancelable(true);
        }
        LIZLLL();
        LIZJ();
        C16880lQ.LLLZIIL(c79925VYj.LIZIZ, C16880lQ.LLZIL(context), this.LJLILLLLZI);
        TextView textView = (TextView) LIZIZ(R.id.lyc);
        View LIZIZ = LIZIZ(R.id.j_p);
        Button button = (Button) LIZIZ(R.id.auf);
        Button button2 = (Button) LIZIZ(R.id.au6);
        button.setTag("submit");
        button2.setTag("cancel");
        C16880lQ.LJIILIIL(button, this);
        C16880lQ.LJIILIIL(button2, this);
        java.util.Map<String, String> LIZ = c79925VYj.LJIILL.LIZ();
        if (TextUtils.isEmpty(null)) {
            str = LIZ.get("confirm");
        } else {
            str = null;
        }
        button.setText(str);
        if (TextUtils.isEmpty(null)) {
            str2 = LIZ.get("cancel");
        } else {
            str2 = null;
        }
        button2.setText(str2);
        if (TextUtils.isEmpty(c79925VYj.LIZLLL)) {
            str3 = "";
        } else {
            str3 = c79925VYj.LIZLLL;
        }
        textView.setText(str3);
        button.setTextColor(c79925VYj.LJ);
        button2.setTextColor(c79925VYj.LJFF);
        textView.setTextColor(c79925VYj.LJI);
        LIZIZ.setBackgroundColor(-657931);
        float f = 17;
        button.setTextSize(f);
        button2.setTextSize(f);
        textView.setTextSize(c79925VYj.LJII);
        View LIZIZ2 = LIZIZ(R.id.hcf);
        LIZIZ2.setBackgroundColor(-1);
        VIB vib = new VIB(LIZIZ2);
        this.LJLL = vib;
        vib.LJFF = c79925VYj;
        VID vid = c79925VYj.LJIIJJI;
        if (vid != null) {
            vib.LJ = vid;
        }
        List<List<String>> list = c79925VYj.LJIILIIL;
        if (list == null) {
            vib.LIZJ = null;
            ((ArrayList) vib.LIZIZ).clear();
            View view = vib.LIZ;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
            }
        } else {
            List<List<String>> list2 = vib.LIZJ;
            if (list2 == null) {
                vib.LIZJ = new ArrayList();
            } else {
                ((ArrayList) list2).clear();
            }
            ((ArrayList) vib.LIZJ).addAll(list);
            for (int i = 0; i < ((ArrayList) list).size(); i++) {
                Object obj = ListProtector.get(list, i);
                if (obj != null) {
                    while (((ArrayList) vib.LIZIZ).size() <= i) {
                        C79762VSc c79762VSc = new C79762VSc(vib.LIZ.getContext(), null);
                        c79762VSc.setLocalizeAdapter(vib.LJFF.LJIILL);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                        layoutParams.weight = 1.0f;
                        c79762VSc.setLayoutParams(layoutParams);
                        c79762VSc.setOnItemSelectedListener(new VIC(vib, i));
                        View view2 = vib.LIZ;
                        if (view2 instanceof ViewGroup) {
                            ((ViewGroup) view2).addView(c79762VSc);
                        }
                        ((ArrayList) vib.LIZIZ).add(c79762VSc);
                    }
                    ((C79762VSc) ListProtector.get(vib.LIZIZ, i)).setAdapter(new C36581c6(1, obj));
                } else {
                    throw new IllegalArgumentException("items can not be null");
                }
            }
            if (((ArrayList) vib.LIZLLL).size() != ((ArrayList) vib.LIZJ).size()) {
                vib.LIZ(null);
            }
        }
        VIB vib2 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it = ((ArrayList) vib2.LIZIZ).iterator();
        while (it.hasNext()) {
            ((C79762VSc) it.next()).setTextSize(18);
        }
        VIB vib3 = this.LJLL;
        int i2 = this.LJLLI.LJIIJ;
        Iterator it2 = ((ArrayList) vib3.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C79762VSc) it2.next()).setItemsVisibleCount(i2);
        }
        VIB vib4 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it3 = ((ArrayList) vib4.LIZIZ).iterator();
        while (it3.hasNext()) {
            ((C79762VSc) it3.next()).setAlphaGradient(false);
        }
        VIB vib5 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it4 = ((ArrayList) vib5.LIZIZ).iterator();
        while (it4.hasNext()) {
            ((C79762VSc) it4.next()).setLabel(null);
        }
        VIB vib6 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it5 = ((ArrayList) vib6.LIZIZ).iterator();
        while (it5.hasNext()) {
            it5.next();
        }
        this.LJLLI.getClass();
        this.LJLLI.getClass();
        VIB vib7 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it6 = ((ArrayList) vib7.LIZIZ).iterator();
        while (it6.hasNext()) {
            ((C79762VSc) it6.next()).setCyclic(false);
        }
        VIB vib8 = this.LJLL;
        Typeface typeface = this.LJLLI.LJIIIIZZ;
        Iterator it7 = ((ArrayList) vib8.LIZIZ).iterator();
        while (it7.hasNext()) {
            ((C79762VSc) it7.next()).setTypeface(typeface);
        }
        this.LJLLI.getClass();
        LJI();
        VIB vib9 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it8 = ((ArrayList) vib9.LIZIZ).iterator();
        while (it8.hasNext()) {
            ((C79762VSc) it8.next()).setDividerColor(-2763307);
        }
        VIB vib10 = this.LJLL;
        VK0 vk0 = this.LJLLI.LJIIIZ;
        Iterator it9 = ((ArrayList) vib10.LIZIZ).iterator();
        while (it9.hasNext()) {
            ((C79762VSc) it9.next()).setDividerType(vk0);
        }
        VIB vib11 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it10 = ((ArrayList) vib11.LIZIZ).iterator();
        while (it10.hasNext()) {
            ((C79762VSc) it10.next()).setLineSpacingMultiplier(1.6f);
        }
        VIB vib12 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it11 = ((ArrayList) vib12.LIZIZ).iterator();
        while (it11.hasNext()) {
            ((C79762VSc) it11.next()).setTextColorOut(-5723992);
        }
        VIB vib13 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it12 = ((ArrayList) vib13.LIZIZ).iterator();
        while (it12.hasNext()) {
            ((C79762VSc) it12.next()).setTextColorCenter(-14013910);
        }
        VIB vib14 = this.LJLL;
        this.LJLLI.getClass();
        Iterator it13 = ((ArrayList) vib14.LIZIZ).iterator();
        while (it13.hasNext()) {
            ((C79762VSc) it13.next()).LJLJL = false;
        }
        List<Integer> list3 = this.LJLLI.LJIILJJIL;
        VIB vib15 = this.LJLL;
        if (vib15 != null) {
            vib15.LIZ(list3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.LJLLI.LJIIL != null) {
                VIB vib = this.LJLL;
                vib.getClass();
                this.LJLLI.LJIIL.LIZ(new ArrayList(vib.LIZLLL));
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
