package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AcQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26610AcQ extends ConstraintLayout {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public List<String> LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public final java.util.Map<Integer, View> LJLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getAddressDetailText() {
        return this.LJLJL;
    }

    public final String getEmailText() {
        return this.LJLJJL;
    }

    public final boolean getHasPrefix() {
        return this.LJLIL;
    }

    public final String getHintText() {
        return this.LJLLJ;
    }

    public final String getNameText() {
        return this.LJLJI;
    }

    public final List<String> getPhoneList() {
        return this.LJLJJI;
    }

    public final boolean getReachable() {
        return this.LJLLI;
    }

    public final String getRegionText() {
        return this.LJLJJLL;
    }

    public final int getSuffixType() {
        return this.LJLILLLLZI;
    }

    public final String getUiMode() {
        return this.LJLLILLLL;
    }

    public final String getZipcodeText() {
        return this.LJLJLJ;
    }

    public final void setAddressDetailText(String str) {
        this.LJLJL = str;
        ((TextView) _$_findCachedViewById(R.id.x4)).setText(this.LJLJL);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.x4);
        String str2 = this.LJLJL;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void setDefault(boolean z) {
        int i;
        this.LJLJLLL = z;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.c5j);
        if (this.LJLJLLL) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void setEmailText(String str) {
        this.LJLJJL = str;
        ((TextView) _$_findCachedViewById(R.id.ct5)).setText(this.LJLJJL);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ct5);
        String str2 = this.LJLJJL;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void setHasPrefix(boolean z) {
        int i;
        this.LJLIL = z;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.i13);
        if (this.LJLIL) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (this.LJLIL) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.gvs);
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.gvs).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart((int) KL2.LIZJ(getContext(), 12.0f));
            _$_findCachedViewById.setLayoutParams(marginLayoutParams);
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.gvs);
        ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.gvs).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart((int) KL2.LIZJ(getContext(), 16.0f));
        _$_findCachedViewById2.setLayoutParams(marginLayoutParams2);
    }

    public final void setHintText(String str) {
        boolean z;
        this.LJLLJ = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.e5v).setVisibility(8);
        } else {
            _$_findCachedViewById(R.id.e5v).setVisibility(0);
        }
        ((TextView) _$_findCachedViewById(R.id.e5v)).setText(this.LJLLJ);
    }

    public final void setNameText(String str) {
        this.LJLJI = str;
        ((TextView) _$_findCachedViewById(R.id.gvs)).setText(this.LJLJI);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.gvs);
        String str2 = this.LJLJI;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void setPaddingVertical(int i) {
        float f = i;
        setPadding(0, (int) KL2.LIZJ(getContext(), f), 0, (int) KL2.LIZJ(getContext(), f));
    }

    public final void setPhoneList(List<String> list) {
        this.LJLJJI = list;
        TextView textView = (TextView) _$_findCachedViewById(R.id.hnd);
        List<String> list2 = this.LJLJJI;
        C116714i3 c116714i3 = null;
        int i = 0;
        if (list2 != null) {
            C116724i4 c116724i4 = new C116724i4();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (C26338AVi.LIZJ(context)) {
                list2 = ORZ.LLIILII(list2);
            }
            int i2 = 0;
            for (String str : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str2 = str;
                    if (str2 != null) {
                        c116724i4.LIZLLL(str2);
                    }
                    if (i2 != C47261Igj.LJJI(list2)) {
                        c116724i4.LIZIZ(" , ");
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c116714i3 = c116724i4.LIZ;
        }
        textView.setText(c116714i3);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hnd);
        List<String> list3 = this.LJLJJI;
        if (list3 == null || list3.isEmpty()) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void setReachable(boolean z) {
        this.LJLLI = z;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.gu, context2);
        if (!this.LJLLI) {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gp, context3);
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.gp, context4);
        }
        ((TextView) _$_findCachedViewById(R.id.gvs)).setTextColor(LJIIIIZZ);
        ((TextView) _$_findCachedViewById(R.id.hnd)).setTextColor(LJIIIIZZ2);
        ((TextView) _$_findCachedViewById(R.id.iu1)).setTextColor(LJIIIIZZ2);
        ((TextView) _$_findCachedViewById(R.id.x4)).setTextColor(LJIIIIZZ2);
        ((TextView) _$_findCachedViewById(R.id.nkt)).setTextColor(LJIIIIZZ2);
        ((TextView) _$_findCachedViewById(R.id.ct5)).setTextColor(LJIIIIZZ2);
    }

    public final void setRegionText(String str) {
        this.LJLJJLL = str;
        ((TextView) _$_findCachedViewById(R.id.iu1)).setText(this.LJLJJLL);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.iu1);
        String str2 = this.LJLJJLL;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void setSuffixType(int i) {
        int i2;
        int i3;
        int i4;
        this.LJLILLLLZI = i;
        View radio = _$_findCachedViewById(R.id.iln);
        o.LJIIIIZZ(radio, "radio");
        int i5 = 0;
        if (this.LJLILLLLZI == 3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        radio.setVisibility(i2);
        ImageView forward = (ImageView) _$_findCachedViewById(R.id.dlv);
        o.LJIIIIZZ(forward, "forward");
        if (this.LJLILLLLZI == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        forward.setVisibility(i3);
        View edit = _$_findCachedViewById(R.id.cn7);
        o.LJIIIIZZ(edit, "edit");
        if (this.LJLILLLLZI == 1) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        edit.setVisibility(i4);
        View change = _$_findCachedViewById(R.id.b8t);
        o.LJIIIIZZ(change, "change");
        if (this.LJLILLLLZI != 4) {
            i5 = 8;
        }
        change.setVisibility(i5);
        if (this.LJLILLLLZI == 1) {
            post(new ARunnableS40S0100000_4(this, 113));
        } else {
            _$_findCachedViewById(R.id.bnd).setTouchDelegate(null);
        }
    }

    public final void setUiMode(String value) {
        o.LJIIIZ(value, "value");
        this.LJLLILLLL = value;
        if (o.LJ(value, "simple")) {
            ((TextView) _$_findCachedViewById(R.id.gvs)).setMaxLines(1);
            ((TextView) _$_findCachedViewById(R.id.hnd)).setMaxLines(1);
            ((TextView) _$_findCachedViewById(R.id.x4)).setMaxLines(2);
            ((TextView) _$_findCachedViewById(R.id.iu1)).setMaxLines(1);
            ((TextView) _$_findCachedViewById(R.id.nkt)).setMaxLines(1);
            return;
        }
        ((TextView) _$_findCachedViewById(R.id.gvs)).setMaxLines(Integer.MAX_VALUE);
        ((TextView) _$_findCachedViewById(R.id.hnd)).setMaxLines(1);
        ((TextView) _$_findCachedViewById(R.id.x4)).setMaxLines(Integer.MAX_VALUE);
        ((TextView) _$_findCachedViewById(R.id.iu1)).setMaxLines(Integer.MAX_VALUE);
        ((TextView) _$_findCachedViewById(R.id.nkt)).setMaxLines(1);
    }

    public final void setUnavailable(boolean z) {
        int i;
        this.LJLL = z;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.msp);
        if (this.LJLL) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public final void setZipcodeText(String str) {
        this.LJLJLJ = str;
        ((TextView) _$_findCachedViewById(R.id.nkt)).setText(this.LJLJLJ);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.nkt);
        String str2 = this.LJLJLJ;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    public C26610AcQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = true;
        this.LJLILLLLZI = 2;
        this.LJLJI = "";
        this.LJLJJL = "";
        this.LJLJJLL = "";
        this.LJLJL = "";
        this.LJLJLJ = "";
        this.LJLLI = true;
        this.LJLLILLLL = "simple";
        this.LJLLJ = "";
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.x8, this, true);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new C018905p(-1, -2);
        }
        setLayoutParams(layoutParams);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a63, R.attr.a6p});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…commerce_AddressInfoCard)");
        setHasPrefix(obtainStyledAttributes.getBoolean(0, true));
        setSuffixType(obtainStyledAttributes.getInt(1, 2));
        obtainStyledAttributes.recycle();
        setPaddingVertical(16);
        C78897Uxp.LJJJJJL(this, 0.0f);
        _$_findCachedViewById(R.id.cn7).setOnTouchListener(new ViewOnTouchListenerC2059986p());
    }
}
