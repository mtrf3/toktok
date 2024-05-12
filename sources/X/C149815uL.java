package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5uL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149815uL extends AbstractC65781Prl implements InterfaceC65784Pro<List<Effect>> {
    public static final C149815uL LJLIL = new C149815uL();

    public C149815uL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<Effect> invoke() {
        ArrayList arrayList = new ArrayList();
        Effect effect = new Effect(null, 1, null);
        effect.setEffectId("reggae");
        String string = C5L7.LIZ().getString(R.string.rhp);
        o.LJIIIIZZ(string, "AppContextManager.getApp…dReggaeBottomSheet_title)");
        effect.setName(string);
        arrayList.add(effect);
        Effect effect2 = new Effect(null, 1, null);
        effect2.setEffectId("jazz");
        String string2 = C5L7.LIZ().getString(R.string.rho);
        o.LJIIIIZZ(string2, "AppContextManager.getApp…undJazzBottomSheet_title)");
        effect2.setName(string2);
        arrayList.add(effect2);
        Effect effect3 = new Effect(null, 1, null);
        effect3.setEffectId("rnb");
        String string3 = C5L7.LIZ().getString(R.string.ri7);
        o.LJIIIIZZ(string3, "AppContextManager.getApp…fectsPage_rnbEffect_body)");
        effect3.setName(string3);
        arrayList.add(effect3);
        Effect effect4 = new Effect(null, 1, null);
        effect4.setEffectId("lofi");
        String string4 = C5L7.LIZ().getString(R.string.ri6);
        o.LJIIIIZZ(string4, "AppContextManager.getApp…ectsPage_lofiEffect_body)");
        effect4.setName(string4);
        arrayList.add(effect4);
        Effect effect5 = new Effect(null, 1, null);
        effect5.setEffectId("hiphop");
        String string5 = C5L7.LIZ().getString(R.string.ri4);
        o.LJIIIIZZ(string5, "AppContextManager.getApp…tsPage_hipHopEffect_body)");
        effect5.setName(string5);
        arrayList.add(effect5);
        Effect effect6 = new Effect(null, 1, null);
        effect6.setEffectId("folk");
        String string6 = C5L7.LIZ().getString(R.string.ri3);
        o.LJIIIIZZ(string6, "AppContextManager.getApp…ectsPage_folkEffect_body)");
        effect6.setName(string6);
        arrayList.add(effect6);
        return arrayList;
    }
}
