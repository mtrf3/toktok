package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78825Uwf implements C2V {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C78826Uwg LJLILLLLZI;
    public final /* synthetic */ C78820Uwa LJLJI;
    public final /* synthetic */ String[] LJLJJI;
    public final /* synthetic */ InterfaceC78830Uwk LJLJJL;

    @Override // X.InterfaceC30685C2n
    public final void onSuccess() {
        Effect effect;
        String effectId;
        java.util.Map<String, String> map;
        C46193IAz c46193IAz;
        String str;
        C15280iq.LJI("OptionCategoryPanelViewModel", "Updated view with new selection successfully.");
        if (this.LJLIL) {
            List<C78801UwH> list = this.LJLILLLLZI.LJFF;
            C78820Uwa c78820Uwa = this.LJLJI;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C78801UwH c78801UwH = (C78801UwH) it.next();
                if (o.LJ(c78801UwH.LIZ, c78820Uwa.LIZ)) {
                    C78820Uwa c78820Uwa2 = this.LJLJI;
                    boolean z = false;
                    for (C78789Uw5 c78789Uw5 : c78801UwH.LJ) {
                        if (o.LJ(c78789Uw5, c78820Uwa2.LJ)) {
                            z = c78789Uw5.LJIIJ;
                        } else {
                            c78789Uw5.LJIIJ = false;
                        }
                    }
                    C78820Uwa c78820Uwa3 = this.LJLJI;
                    C78789Uw5 c78789Uw52 = c78820Uwa3.LJ;
                    if (c78789Uw52 != null) {
                        c78789Uw52.LJIIJ = !z;
                    }
                    if (this.LJLJJI.length == 0) {
                        C46193IAz c46193IAz2 = this.LJLILLLLZI.LIZJ;
                        if (c46193IAz2 != null) {
                            c46193IAz2.g(c78820Uwa3.LIZJ);
                        }
                    } else {
                        C46193IAz c46193IAz3 = this.LJLILLLLZI.LIZJ;
                        if (c46193IAz3 != null && (map = c46193IAz3.LLJILJIL) != null && map.containsKey(c78820Uwa3.LIZJ) && (c46193IAz = this.LJLILLLLZI.LIZJ) != null) {
                            c46193IAz.g(this.LJLJI.LIZJ);
                        }
                        C78789Uw5 c78789Uw53 = this.LJLJI.LJ;
                        if (c78789Uw53 != null && (effect = c78789Uw53.LJFF) != null && (effectId = effect.getEffectId()) != null) {
                            C78826Uwg c78826Uwg = this.LJLILLLLZI;
                            C78820Uwa c78820Uwa4 = this.LJLJI;
                            C46193IAz c46193IAz4 = c78826Uwg.LIZJ;
                            if (c46193IAz4 != null) {
                                c46193IAz4.LLJJJIL(c78820Uwa4.LIZJ, effectId);
                            }
                        }
                    }
                    if (C78886Uxe.LJJIJIIJI(this.LJLILLLLZI.LIZ)) {
                        C78826Uwg c78826Uwg2 = this.LJLILLLLZI;
                        C78820Uwa c78820Uwa5 = this.LJLJI;
                        String str2 = c78820Uwa5.LIZ;
                        String str3 = this.LJLJJI[0];
                        C78789Uw5 c78789Uw54 = c78820Uwa5.LJ;
                        if (c78789Uw54 != null) {
                            str = c78789Uw54.LIZLLL;
                        } else {
                            str = null;
                        }
                        c78826Uwg2.getClass();
                        C145995oB c145995oB = new C145995oB();
                        c145995oB.LJI("template_id", c78826Uwg2.LIZ.getResourceId());
                        c145995oB.LJI("template_name", c78826Uwg2.LIZ.getName());
                        c145995oB.LJI("item_category", str2);
                        c145995oB.LJI("name", str);
                        c145995oB.LJI("item_id", str3);
                        c145995oB.LJI("creation_id", c78826Uwg2.LIZLLL.LJI());
                        c145995oB.LJI("shoot_way", c78826Uwg2.LIZLLL.shootWay);
                        c145995oB.LJI("enter_from", c78826Uwg2.LIZLLL.enterFrom);
                        java.util.Map<String, String> map2 = c145995oB.LIZ;
                        o.LJIIIIZZ(map2, "newBuilder()\n           …text.enterFrom).builder()");
                        C78880UxY.LJJLIIIJL("mobile_effect_face_filter_select_item", map2);
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        InterfaceC78830Uwk interfaceC78830Uwk = this.LJLJJL;
        if (interfaceC78830Uwk != null) {
            interfaceC78830Uwk.LIZIZ(new OSZ<>(Integer.valueOf(this.LJLJI.LIZIZ), Integer.valueOf(this.LJLJI.LIZLLL)));
        }
    }

    @Override // X.C2V
    public final void LIZIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Updating view with selection failed, errorCode:");
        LIZ.append(uIAnnotationErrorCode);
        C15280iq.LJI("OptionCategoryPanelViewModel", X1D.LIZIZ(LIZ));
        InterfaceC78830Uwk interfaceC78830Uwk = this.LJLJJL;
        if (interfaceC78830Uwk != null) {
            interfaceC78830Uwk.LIZ(uIAnnotationErrorCode);
        }
    }

    public C78825Uwf(boolean z, C78826Uwg c78826Uwg, C78820Uwa c78820Uwa, String[] strArr, C78814UwU c78814UwU) {
        this.LJLIL = z;
        this.LJLILLLLZI = c78826Uwg;
        this.LJLJI = c78820Uwa;
        this.LJLJJI = strArr;
        this.LJLJJL = c78814UwU;
    }
}
