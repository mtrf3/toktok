package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS27S0300000_1;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3z4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101783z4 extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLIL;
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

    public final void LIZIZ(EnumC101803z6 enumC101803z6, int i) {
        EnumC101483ya enumC101483ya;
        int i2 = C101823z8.LIZ[enumC101803z6.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                C101543yg c101543yg = C101543yg.LIZ;
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                EnumC101583yk enumC101583yk = EnumC101583yk.DM_SETTINGS_BOTTOM_SHEET;
                c101543yg.getClass();
                C101543yg.LIZIZ(context, R.string.eru, "notification_page", "inbox_top", "inbox_top_toast", enumC101583yk);
            }
        } else {
            C101543yg c101543yg2 = C101543yg.LIZ;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            c101543yg2.getClass();
            C101543yg.LIZJ(context2);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        enumC101483ya = EnumC101483ya.MAF;
                    } else {
                        "invalid permission type".toString();
                        throw new IllegalStateException("invalid permission type");
                    }
                } else {
                    enumC101483ya = EnumC101483ya.NO_ONE;
                }
            } else {
                enumC101483ya = EnumC101483ya.FRIENDS;
            }
        } else {
            enumC101483ya = EnumC101483ya.EVERYONE;
        }
        ASQ.LIZLLL(this, new C101863zC(new C97903so(enumC101483ya)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101783z4(Context context, EnumC101803z6 sheetMode, List list) {
        super(context, null, 0);
        int i;
        int i2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sheetMode, "sheetMode");
        this.LJLIL = new LinkedHashMap();
        int i3 = 0;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.c9);
        setBackground(c110614Vt.LIZ(context));
        setOrientation(1);
        setGravity(1);
        C16880lQ.LLLZIIL(R.layout.b_7, C16880lQ.LLZIL(context), this);
        TextView textView = (TextView) LIZ(R.id.mdk);
        int[] iArr = C101823z8.LIZ;
        int i4 = iArr[sheetMode.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                i = R.string.ern;
            } else {
                throw new C162476Zf();
            }
        } else {
            i = R.string.esq;
        }
        textView.setText(context.getString(i));
        TextView textView2 = (TextView) LIZ(R.id.i4c);
        int i5 = iArr[sheetMode.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i2 = R.string.erg;
            } else {
                throw new C162476Zf();
            }
        } else {
            i2 = R.string.q8h;
        }
        textView2.setText(context.getString(i2));
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.f0h), new ACListenerS21S0100000_1(this, 261));
        View LIZ = LIZ(R.id.dgb);
        if (LIZ != null) {
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cr);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(8);
            LIZ.setBackground(c110614Vt2.LIZ(context));
            if (sheetMode == EnumC101803z6.RECEIVER) {
                C26338AVi.LJI(LIZ, null, 0, null, null, false, 29);
            }
        }
        RecyclerView recyclerView = (RecyclerView) LIZ(R.id.j9x);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager());
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC101893zF interfaceC101893zF = (InterfaceC101893zF) it.next();
                    if ((interfaceC101893zF instanceof C101833z9) && ((C101833z9) interfaceC101893zF).LIZLLL) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            recyclerView.setAdapter(new C101953zL(list, i3));
        }
        C16880lQ.LJJIZ((SY4) LIZ(R.id.i4c), new ACListenerS27S0300000_1(list, this, sheetMode, 14));
    }
}
