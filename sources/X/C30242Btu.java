package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.toolbar.TBViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Btu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30242Btu implements InterfaceC30273BuP {
    public final java.util.Map<EnumC30206BtK, C30239Btr> LIZ = new LinkedHashMap();
    public final java.util.Map<EnumC30241Btt, InterfaceC30264BuG> LIZIZ = new LinkedHashMap();
    public final java.util.Map<EnumC30241Btt, TBViewModel> LIZJ = new LinkedHashMap();
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 358));
    public C30252Bu4 LJ;

    public final C30252Bu4 LIZJ() {
        C30252Bu4 c30252Bu4 = this.LJ;
        if (c30252Bu4 != null) {
            return c30252Bu4;
        }
        o.LJIJI("toolbarContext");
        throw null;
    }

    @Override // X.InterfaceC30273BuP
    public final void LIZ(EnumC30206BtK enumC30206BtK) {
        if (enumC30206BtK == null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZ;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C30239Btr) it.next()).LIZIZ();
            }
            linkedHashMap.clear();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LIZJ;
            Iterator it2 = linkedHashMap2.values().iterator();
            while (it2.hasNext()) {
                ((TBViewModel) it2.next()).gv0(LIZJ().LIZIZ);
            }
            linkedHashMap2.clear();
            ((LinkedHashMap) this.LIZIZ).clear();
            return;
        }
        C30239Btr c30239Btr = (C30239Btr) ((LinkedHashMap) this.LIZ).get(enumC30206BtK);
        if (c30239Btr != null) {
            c30239Btr.LIZIZ();
        }
        this.LIZ.remove(enumC30206BtK);
        if (this.LIZ.isEmpty()) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.LIZJ;
            Iterator it3 = linkedHashMap3.values().iterator();
            while (it3.hasNext()) {
                ((TBViewModel) it3.next()).gv0(LIZJ().LIZIZ);
            }
            linkedHashMap3.clear();
            ((LinkedHashMap) this.LIZIZ).clear();
        }
    }

    public final InterfaceC30264BuG LIZIZ(EnumC30241Btt enumC30241Btt) {
        return (InterfaceC30264BuG) ((LinkedHashMap) this.LIZIZ).get(enumC30241Btt);
    }

    public final TBViewModel LIZLLL(EnumC30241Btt button) {
        o.LJIIIZ(button, "button");
        return (TBViewModel) ((LinkedHashMap) this.LIZJ).get(button);
    }

    public final void LJFF(EnumC30241Btt button) {
        o.LJIIIZ(button, "button");
        Iterator it = ((LinkedHashMap) this.LIZ).values().iterator();
        while (it.hasNext()) {
            ((C30239Btr) it.next()).LIZJ(button);
        }
        this.LIZIZ.remove(button);
        TBViewModel tBViewModel = (TBViewModel) ((LinkedHashMap) this.LIZJ).get(button);
        if (tBViewModel != null) {
            tBViewModel.gv0(LIZJ().LIZIZ);
        }
        this.LIZJ.remove(button);
    }

    public final void LJ(EnumC30241Btt button, InterfaceC30264BuG behavior, InterfaceC88472Yns<? super TBViewModel, C76800UCe> interfaceC88472Yns) {
        Fragment fragment;
        Drawable LIZLLL;
        o.LJIIIZ(button, "button");
        o.LJIIIZ(behavior, "behavior");
        LifecycleOwner lifecycleOwner = LIZJ().LIZIZ;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            TBViewModel LIZ = C30102Bre.LIZ(button, fragment);
            Integer icon = button.icon(LIZJ().LIZLLL);
            if (icon != null) {
                int intValue = icon.intValue();
                int LJ = C259910h.LJ(intValue, LIZJ().LIZ);
                MutableLiveData<Drawable> mutableLiveData = LIZ.LJLIL;
                if (LJ == -1) {
                    LIZLLL = C15380j0.LJI(intValue);
                } else {
                    LIZLLL = C259910h.LIZLLL(intValue, LIZJ().LIZ);
                }
                mutableLiveData.setValue(LIZLLL);
            }
            Integer text = button.text(LIZJ().LIZLLL);
            if (text != null) {
                LIZ.LJLILLLLZI.setValue(C15380j0.LJIILJJIL(text.intValue()));
            }
            Integer title = button.title(LIZJ().LIZLLL);
            if (title != null) {
                LIZ.LJLJI.setValue(C15380j0.LJIILJJIL(title.intValue()));
            }
            LIZ.LJLJJLL.setValue(Float.valueOf(1.0f));
            LIZ.LJLJL.setValue(new C30268BuK(true, true));
            MutableLiveData<Boolean> mutableLiveData2 = LIZ.LJLJLJ;
            Boolean bool = Boolean.TRUE;
            mutableLiveData2.setValue(bool);
            LIZ.LJLJLLL.setValue(bool);
            LIZ.LJLL.setValue(EnumC30255Bu7.NONE);
            LIZ.LJLLI.setValue(null);
            LIZ.LJLLILLLL.setValue(null);
            this.LIZJ.put(button, LIZ);
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(LIZ);
            }
        }
        Iterator it = ((LinkedHashMap) this.LIZ).values().iterator();
        while (it.hasNext()) {
            ((C30239Btr) it.next()).LIZ(button, behavior, false);
        }
        this.LIZIZ.put(button, behavior);
    }
}
