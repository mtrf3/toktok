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
import kotlin.jvm.internal.o;

/* renamed from: X.Abb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26559Abb extends ConstraintLayout {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
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

    private final void setHasPrefix(boolean z) {
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
            View _$_findCachedViewById = _$_findCachedViewById(R.id.gvv);
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.gvv).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            _$_findCachedViewById.setLayoutParams(marginLayoutParams);
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.gvv);
        ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.gvv).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        _$_findCachedViewById2.setLayoutParams(marginLayoutParams2);
    }

    private final void setSuffixType(int i) {
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
            post(new ARunnableS40S0100000_4(this, 40));
        } else {
            _$_findCachedViewById(R.id.bnd).setTouchDelegate(null);
        }
    }

    public final void setAddressInfo(C26566Abi item) {
        int i;
        int i2;
        String str;
        int i3;
        String LIZ;
        o.LJIIIZ(item, "item");
        String str2 = item.LIZIZ;
        if (str2 != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (!C26338AVi.LIZJ(context)) {
                StringBuilder LJFF = C72972SkS.LJFF(str2, ' ');
                LJFF.append(item.LIZJ);
                LIZ = X1D.LIZIZ(LJFF);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ = C0MT.LIZ(LIZ2, item.LIZJ, ' ', str2, LIZ2);
            }
            ((TextView) _$_findCachedViewById(R.id.gvv)).setText(LIZ);
        }
        View name_and_contact = _$_findCachedViewById(R.id.gvv);
        o.LJIIIIZZ(name_and_contact, "name_and_contact");
        String str3 = item.LIZIZ;
        int i4 = 0;
        if (str3 == null || str3.length() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        name_and_contact.setVisibility(i);
        String str4 = item.LJ;
        if (str4 != null) {
            if (C78685UuP.LJJJZ(item.LIZLLL)) {
                TextView textView = (TextView) _$_findCachedViewById(R.id.x4);
                StringBuilder LJFF2 = C72972SkS.LJFF(str4, '\n');
                LJFF2.append(item.LIZLLL);
                textView.setText(X1D.LIZIZ(LJFF2));
            } else {
                ((TextView) _$_findCachedViewById(R.id.x4)).setText(str4);
            }
        }
        View address_detail = _$_findCachedViewById(R.id.x4);
        o.LJIIIIZZ(address_detail, "address_detail");
        String str5 = item.LJ;
        if (str5 == null || str5.length() == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        address_detail.setVisibility(i2);
        if (C78685UuP.LJJJZ(item.LJFF) && C78685UuP.LJJJZ(item.LJII)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(item.LJFF);
            LIZ3.append(" · ");
            LIZ3.append(item.LJII);
            str = X1D.LIZIZ(LIZ3);
        } else if (C78685UuP.LJJJZ(item.LJFF)) {
            str = item.LJFF;
        } else if (C78685UuP.LJJJZ(item.LJII)) {
            str = item.LJFF;
        } else {
            str = "";
        }
        TextView zipcode = (TextView) _$_findCachedViewById(R.id.nkt);
        o.LJIIIIZZ(zipcode, "zipcode");
        OUP.LJJLIIIJILLIZJL(zipcode, str);
        Boolean bool = item.LJIIJ;
        Boolean bool2 = Boolean.FALSE;
        if (o.LJ(bool, bool2)) {
            ((TextView) _$_findCachedViewById(R.id.e5v)).setText(item.LJIIIIZZ);
        }
        View hint_text = _$_findCachedViewById(R.id.e5v);
        o.LJIIIIZZ(hint_text, "hint_text");
        if (!o.LJ(item.LJIIJ, bool2)) {
            i4 = 8;
        }
        hint_text.setVisibility(i4);
        if (item.LJIIL) {
            java.util.Map LJJLIL = C113554cx.LJJLIL(C27949Ay1.LIZIZ);
            LJJLIL.put("button_name", "change_address");
            C76542zS.LIZ("tiktokec_button_show", LJJLIL);
            i3 = 4;
        } else {
            i3 = 2;
        }
        setSuffixType(i3);
    }

    public final void setPaddingVertical(int i) {
        float f = i;
        setPadding(0, (int) KL2.LIZJ(getContext(), f), 0, (int) KL2.LIZJ(getContext(), f));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26559Abb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26559Abb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = true;
        this.LJLILLLLZI = 2;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.x9, this, true);
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
