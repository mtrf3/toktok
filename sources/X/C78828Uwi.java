package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78828Uwi implements IFetchCategoryEffectListener {
    public final /* synthetic */ CountDownLatch LIZ;
    public final /* synthetic */ InterfaceC78811UwR LIZIZ;
    public final /* synthetic */ java.util.Map<C78832Uwm, List<C78801UwH>> LIZJ;
    public final /* synthetic */ C68322mC<C78789Uw5> LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ Effect LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ C78826Uwg LJII;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult r8) {
        /*
            r7 = this;
            java.util.concurrent.CountDownLatch r0 = r7.LIZ
            r0.countDown()
            java.util.concurrent.CountDownLatch r0 = r7.LIZ
            long r5 = r0.getCount()
            r3 = 0
            r2 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L20
            java.lang.String r1 = "OptionListManagerImpl"
            java.lang.String r0 = "Fetch all category effect completed, with 1+ failures"
            X.C15280iq.LIZJ(r1, r0)
            X.UwR r1 = r7.LIZIZ
            java.util.Map<X.Uwm, java.util.List<X.UwH>> r0 = r7.LIZJ
            r1.LIZIZ(r0, r2)
        L20:
            X.UwR r1 = r7.LIZIZ
            if (r8 == 0) goto L2d
            r8.getErrorCode()
            java.lang.String r0 = r8.getMsg()
            if (r0 != 0) goto L2f
        L2d:
            java.lang.String r0 = "No error message"
        L2f:
            r1.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78828Uwi.onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.Uw5, T] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffects;
        String str;
        String str2;
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null) {
            String str3 = this.LJ;
            java.util.Map<C78832Uwm, List<C78801UwH>> map = this.LIZJ;
            Effect effect = this.LJFF;
            String optionName = this.LJI;
            C68322mC<C78789Uw5> c68322mC = this.LIZLLL;
            C78826Uwg c78826Uwg = this.LJII;
            List<Effect> effects = categoryEffects.getEffects();
            if (str3 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<C78832Uwm, List<C78801UwH>> entry : map.entrySet()) {
                    if (o.LJ(str3, entry.getKey().LIZ)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C78832Uwm c78832Uwm = (C78832Uwm) ORZ.LJLLILLLL(linkedHashMap.keySet());
                List<C78801UwH> list = map.get(c78832Uwm);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    int size = effects.size();
                    int i = 0;
                    while (i < size) {
                        EffectTemplate effectTemplate = (EffectTemplate) ListProtector.get(effects, i);
                        if (effectTemplate != null) {
                            str = effectTemplate.getResourceId();
                        } else {
                            str = null;
                        }
                        String str4 = "";
                        if (effect != null) {
                            String extra = effect.getExtra();
                            if (extra != null) {
                                try {
                                    new com.google.gson.o();
                                    j LJJIJ = com.google.gson.o.LIZ(extra).LJIIZILJ().LJJIJ("lalaland_field");
                                    if (LJJIJ != null && (str2 = LJJIJ.LJJIFFI()) != null) {
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            str2 = "";
                        } else {
                            str2 = null;
                        }
                        boolean LJ = o.LJ(str, str2);
                        String name = c78832Uwm.LIZ;
                        String str5 = (String) ORZ.LJLLLL(((com.ss.ugc.effectplatform.model.Effect) ListProtector.get(effects, i)).getIcon_url().getUrl_list());
                        if (str5 != null) {
                            str4 = str5;
                        }
                        Effect effect2 = (Effect) ListProtector.get(effects, i);
                        String unzipPath = ((com.ss.ugc.effectplatform.model.Effect) ListProtector.get(effects, i)).getUnzipPath();
                        o.LJIIIIZZ(name, "name");
                        C78789Uw5 c78789Uw5 = r0;
                        String str6 = optionName;
                        ?? c78789Uw52 = new C78789Uw5(name, str4, unzipPath, null, optionName, effect2, 0, 0, 0, null, false, null, 4040);
                        if (LJ) {
                            c68322mC.element = c78789Uw52;
                            o.LJIIIIZZ(optionName, "optionName");
                            c78789Uw5 = c78789Uw5;
                            c78826Uwg.LIZLLL(new C78820Uwa(str6, -1, str6, -1, c78789Uw5), null, true);
                        }
                        arrayList.add(c78789Uw5);
                        i++;
                        optionName = str6;
                    }
                    o.LJIIIIZZ(optionName, "optionName");
                    C78801UwH c78801UwH = new C78801UwH(optionName, optionName, "", new ArrayList(), arrayList);
                    ((ArrayList) c78826Uwg.LJFF).add(c78801UwH);
                    list.add(c78801UwH);
                    map.put(c78832Uwm, list);
                }
            }
        }
        this.LIZ.countDown();
        if (this.LIZ.getCount() == 0) {
            C15280iq.LIZIZ("OptionListManagerImpl", "fetch all category effect completed");
            this.LIZIZ.LIZIZ(this.LIZJ, this.LIZLLL.element);
        }
    }

    public C78828Uwi(CountDownLatch countDownLatch, C78809UwP c78809UwP, java.util.Map map, C68322mC c68322mC, String str, Effect effect, String str2, C78826Uwg c78826Uwg) {
        this.LIZ = countDownLatch;
        this.LIZIZ = c78809UwP;
        this.LIZJ = map;
        this.LIZLLL = c68322mC;
        this.LJ = str;
        this.LJFF = effect;
        this.LJI = str2;
        this.LJII = c78826Uwg;
    }
}
