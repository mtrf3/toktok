package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jwh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50799Jwh extends SearchBaseSparkView {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJIIJJI;
    public boolean LJIIL;
    public final C50831JxD LJIILIIL;
    public final C5H3 LJIILJJIL;
    public final C50800Jwi LJIILL;
    public final C50805Jwn LJIILLIIL;

    @Override // X.InterfaceC50067Jkt
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC50067Jkt
    public final void LJ(List<DynamicData> dynamicDatas) {
        o.LJIIIZ(dynamicDatas, "dynamicDatas");
        if (!dynamicDatas.isEmpty()) {
            C50068Jku.LIZIZ(this, ((DynamicData) ListProtector.get(dynamicDatas, 0)).dynamicPatch, null, false, false, 62);
        }
    }

    public final void LJIIIIZZ(ISearchContextAbility ability) {
        o.LJIIIZ(ability, "ability");
        SparkContext sparkContext = this.LJIIJJI.getSparkContext();
        if (sparkContext != null) {
            sparkContext.LJII(ISearchContextAbility.class, ability);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50799Jwh(android.content.Context r3, androidx.lifecycle.LifecycleOwner r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r5 & 4
            if (r0 == 0) goto L10
            X.Jwu r0 = X.EnumC50812Jwu.DEFAULT
        Lc:
            r2.<init>(r3, r4, r0, r1)
            return
        L10:
            r0 = r1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50799Jwh.<init>(android.content.Context, androidx.lifecycle.LifecycleOwner, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50799Jwh(android.content.Context r3, androidx.lifecycle.LifecycleOwner r4, X.EnumC50812Jwu r5, com.bytedance.hybrid.spark.SparkContext r6) {
        /*
            r2 = this;
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r2.<init>(r3, r4)
            java.lang.System.currentTimeMillis()
            X.DZY r0 = X.DZY.LJLILLLLZI
            boolean r0 = r0.LJJII()
            if (r0 == 0) goto L3c
            X.Jwu r0 = X.EnumC50812Jwu.SEARCH_MIDDLE
            if (r5 != r0) goto L3c
            X.Ol8 r1 = X.C50967JzP.LIZIZ
            java.lang.Object r0 = r1.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r1.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.remove(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r0.get()
            X.NtS r0 = (X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) r0
            if (r0 != 0) goto L49
        L3c:
            X.FsQ r0 = X.C40343FsR.LJIILJJIL
            if (r6 != 0) goto L45
            com.bytedance.hybrid.spark.SparkContext r6 = new com.bytedance.hybrid.spark.SparkContext
            r6.<init>()
        L45:
            X.NtS r0 = X.KMP.LIZJ(r0, r3, r6)
        L49:
            r2.LJIIJJI = r0
            X.JxD r0 = new X.JxD
            r0.<init>()
            r2.LJIILIIL = r0
            X.Jws r0 = X.C50810Jws.LJLIL
            X.5H3 r0 = X.V16.LJJJJLL(r0)
            r2.LJIILJJIL = r0
            X.Jwi r0 = new X.Jwi
            r0.<init>(r2)
            r2.LJIILL = r0
            X.Jwn r0 = new X.Jwn
            r0.<init>(r2)
            r2.LJIILLIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50799Jwh.<init>(android.content.Context, androidx.lifecycle.LifecycleOwner, X.Jwu, com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // X.InterfaceC50067Jkt
    public final void LJI(DynamicPatch dynamicData, java.util.Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, LynxViewClient lynxViewClient) {
        boolean LJ;
        String str;
        C50433Jqn searchCommonModel;
        String enterFrom;
        C50433Jqn searchCommonModel2;
        AbstractC60800Ntc abstractC60800Ntc;
        VNS vns;
        o.LJIIIZ(dynamicData, "dynamicData");
        DynamicPatch dynamicPatch = this.LJIIIZ;
        if (z3 && dynamicPatch != null) {
            if (o.LJ(dynamicData.schema, dynamicPatch.schema) && o.LJ(dynamicData.getBulletSchema(), dynamicPatch.getBulletSchema())) {
                LJ = true;
            } else {
                LJ = false;
            }
        } else {
            LJ = o.LJ(dynamicData, dynamicPatch);
        }
        if (LJ) {
            Object kitView = this.LJIIJJI.getKitView();
            if ((kitView instanceof VNS) && (vns = (VNS) kitView) != null) {
                vns.onEnterForeground();
            }
            InterfaceC60761Nsz kitView2 = this.LJIIJJI.getKitView();
            if (kitView2 != null && (abstractC60800Ntc = this.LIZJ) != null) {
                abstractC60800Ntc.LJJJJJ(kitView2);
                return;
            }
            return;
        }
        this.LJ.clear();
        this.LJFF.clear();
        this.LIZIZ = null;
        C1HQ c1hq = new C1HQ();
        if (map != null) {
            c1hq.putAll(map);
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        String str2 = "";
        if (LJII == null || (searchCommonModel2 = LJII.getSearchCommonModel()) == null || (str = searchCommonModel2.getEnterFrom()) == null) {
            str = "";
        }
        c1hq.put("search_entrance", str);
        C50650JuI LJII2 = C50651JuJ.LJII(this.LIZ);
        if (LJII2 != null && (searchCommonModel = LJII2.getSearchCommonModel()) != null && (enterFrom = searchCommonModel.getEnterFrom()) != null) {
            str2 = enterFrom;
        }
        c1hq.put("searchEntrance", str2);
        this.LJIIIIZZ.add(AbstractC73745Swv.LJFF(c1hq).LJI(new C50769JwD(z, z2, dynamicData, c1hq, this)).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new C50801Jwj(this, dynamicData, z, lynxViewClient)));
    }
}
