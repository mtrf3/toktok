package X;

import Y.IDcS364S0100000_1;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import o3.IDaS465S0100000_1;
import o3.h0;

/* renamed from: X.4Db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC105754Db extends ActivityC86117Xqz implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public ARV LJLJLJ;
    public AbstractC90763hI LJLJLLL;
    public final C105764Dc LJLL;
    public final C105774Dd LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 913));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 907));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 909));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 912));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 908));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 911));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 910));

    static {
        TBV tbv = new TBV(AbstractViewOnClickListenerC105754Db.class, "mIsMute", "getMIsMute()Z", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(AbstractViewOnClickListenerC105754Db.class, "mIsStickTop", "getMIsStickTop()Z", 0, c65351Pkp)};
    }

    public abstract void LLIIJLIL();

    public void LLIILII() {
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.4Dc] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.4Dd] */
    public AbstractViewOnClickListenerC105754Db() {
        final Boolean bool = Boolean.FALSE;
        this.LJLL = new AbstractC214518bP<Boolean>(bool) { // from class: X.4Dc
            @Override // X.AbstractC214518bP
            public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool2, Boolean bool3) {
                o.LJIIIZ(property, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                if (this.LLII().isChecked() ^ booleanValue) {
                    this.LLII().setChecked(booleanValue);
                }
            }
        };
        this.LJLLI = new AbstractC214518bP<Boolean>(bool) { // from class: X.4Dd
            @Override // X.AbstractC214518bP
            public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool2, Boolean bool3) {
                o.LJIIIZ(property, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                if (this.LLIIIJ().isChecked() ^ booleanValue) {
                    this.LLIIIJ().setChecked(booleanValue);
                }
            }
        };
    }

    public final boolean LLFII() {
        return LIZ(this, LJLLJ[0]).booleanValue();
    }

    public final boolean LLFZ() {
        return LIZ(this, LJLLJ[1]).booleanValue();
    }

    public final ARV LLII() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-muteSwitch>(...)");
        return (ARV) value;
    }

    public final TextView LLIIIILZ() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-muteText>(...)");
        return (TextView) value;
    }

    public final ARV LLIIIJ() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-stickTopSwitch>(...)");
        return (ARV) value;
    }

    public void LLIIIZ() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-muteLayout>(...)");
        h0.LJIJI((View) value, new IDaS465S0100000_1(this, 3));
        Object value2 = this.LJLJL.getValue();
        o.LJIIIIZZ(value2, "<get-stickTopLayout>(...)");
        h0.LJIJI((View) value2, new IDaS465S0100000_1(this, 4));
    }

    public void LLIIJI() {
        C63120Opw LIZLLL;
        LLIIIILZ().setVisibility(0);
        LLII().setVisibility(0);
        C16880lQ.LJIJI(LLIIIILZ(), this);
        LLII().setOnCheckedChangeListener(this);
        AbstractC90763hI abstractC90763hI = this.LJLJLLL;
        if (abstractC90763hI != null && (LIZLLL = abstractC90763hI.LIZLLL()) != null && C55888Lwa.LIZIZ.LJJI(true) && u.LJJIII(LIZLLL)) {
            LLIIIILZ().setVisibility(8);
            LLII().setVisibility(8);
        }
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-stickTopText>(...)");
        C16880lQ.LJIJI((TextView) value, this);
        LLIIIJ().setOnCheckedChangeListener(this);
        Object value2 = this.LJLIL.getValue();
        o.LJIIIIZZ(value2, "<get-titleBar>(...)");
        ((C101043xs) value2).setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3xx
            @Override // X.InterfaceC101063xu
            public final void LIZ() {
            }

            @Override // X.InterfaceC101063xu
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC101063xu
            public final void LIZJ(int i) {
            }

            @Override // X.InterfaceC101063xu
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC101063xu
            public final void LJ() {
                AbstractViewOnClickListenerC105754Db.this.finish();
            }
        });
        LLIIIZ();
    }

    public void LLIL() {
        boolean z;
        C63120Opw LIZLLL;
        C63120Opw LIZLLL2;
        this.LJLJLJ = (ARV) findViewById(R.id.ama);
        AbstractC90763hI abstractC90763hI = this.LJLJLLL;
        boolean z2 = true;
        if (abstractC90763hI != null && (LIZLLL2 = abstractC90763hI.LIZLLL()) != null && LIZLLL2.isStickTop()) {
            z = true;
        } else {
            z = false;
        }
        C105774Dd c105774Dd = this.LJLLI;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLLJ;
        c105774Dd.LIZIZ(interfaceC74236TBoArr[1], this, Boolean.valueOf(z));
        AbstractC90763hI abstractC90763hI2 = this.LJLJLLL;
        if (abstractC90763hI2 == null || (LIZLLL = abstractC90763hI2.LIZLLL()) == null || !LIZLLL.isMute()) {
            z2 = false;
        }
        LIZIZ(interfaceC74236TBoArr[0], this, Boolean.valueOf(z2));
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        String str;
        super.onDestroy();
        AbstractC90763hI abstractC90763hI = this.LJLJLLL;
        if (abstractC90763hI != null) {
            str = abstractC90763hI.LJ();
        } else {
            str = null;
        }
        HashMap<String, Integer> hashMap = C98533tp.LIZIZ;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        HashMap<String, List<C109544Rq>> hashMap2 = C98533tp.LIZ;
        if (hashMap2 != null) {
            hashMap2.remove(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        o.LJIIIZ(v, "v");
        int id = v.getId();
        if (id == R.id.mbt) {
            LLII().setChecked(!LLII().isChecked());
        } else {
            if (id != R.id.ml8) {
                return;
            }
            LLIIIJ().setChecked(!LLIIIJ().isChecked());
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(GDA.LJLIL);
        super.onCreate(bundle);
        LLIIJLIL();
        setContentView(R.layout.b0d);
        LLIILII();
        LLIL();
        LLIIJI();
    }

    public final void LLILIL(String str, boolean z) {
        String str2;
        boolean z2;
        C63120Opw LIZLLL;
        C63120Opw LIZLLL2;
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        AbstractC90763hI abstractC90763hI = this.LJLJLLL;
        if (abstractC90763hI != null && (LIZLLL2 = abstractC90763hI.LIZLLL()) != null && LIZLLL2.getConversationType() == AbstractC63505Ow9.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = null;
        if (z2) {
            AbstractC90763hI abstractC90763hI2 = this.LJLJLLL;
            if (abstractC90763hI2 != null) {
                str3 = abstractC90763hI2.LJ();
            }
            C93363lU.LIZLLL(str3, "group", str2, str);
            return;
        }
        AbstractC90763hI abstractC90763hI3 = this.LJLJLLL;
        if (abstractC90763hI3 == null || (LIZLLL = abstractC90763hI3.LIZLLL()) == null || LIZLLL.getConversationType() != AbstractC63505Ow9.LIZ) {
            return;
        }
        AbstractC90763hI abstractC90763hI4 = this.LJLJLLL;
        if (abstractC90763hI4 != null) {
            str3 = abstractC90763hI4.LJ();
        }
        C93363lU.LIZLLL(str3, "private", str2, str);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == null) {
            return;
        }
        int id = compoundButton.getId();
        if (id == R.id.kxp) {
            if (z == LLFII()) {
                return;
            }
            LLII().setEnabled(false);
            LLILIL("chat_mute_click", !LLFII());
            AbstractC90763hI abstractC90763hI = this.LJLJLLL;
            if (abstractC90763hI == null) {
                return;
            }
            abstractC90763hI.LJIIIIZZ(new IDcS364S0100000_1(this, 17), !LLFII());
            return;
        }
        if (id != R.id.kxq || z == LLFZ()) {
            return;
        }
        LLIIIJ().setEnabled(false);
        LLILIL("chat_top_click", !LLFZ());
        AbstractC90763hI abstractC90763hI2 = this.LJLJLLL;
        if (abstractC90763hI2 == null) {
            return;
        }
        abstractC90763hI2.LJIIZILJ(new IDcS364S0100000_1(this, 18), !LLFZ());
    }
}
