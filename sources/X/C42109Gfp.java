package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.utils.VideoModeUtils$resizeBitmapForVideoMode$1", f = "VideoModeUtils.kt", l = {77, 91}, m = "invokeSuspend")
/* renamed from: X.Gfp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42109Gfp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ CreativeInfo LJLJJL;
    public final /* synthetic */ MvCreateVideoData LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ OSZ<Integer, Integer> LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42109Gfp(CreativeInfo creativeInfo, MvCreateVideoData mvCreateVideoData, int i, OSZ<Integer, Integer> osz, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C42109Gfp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = creativeInfo;
        this.LJLJJLL = mvCreateVideoData;
        this.LJLJL = i;
        this.LJLJLJ = osz;
        this.LJLJLLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C42109Gfp c42109Gfp = new C42109Gfp(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c42109Gfp.LJLJJI = obj;
        return c42109Gfp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LJII;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            concurrentHashMap2 = (ConcurrentHashMap) this.LJLILLLLZI;
            concurrentHashMap = (ConcurrentHashMap) this.LJLIL;
            LJII = (String) this.LJLJJI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLJJI;
            LJII = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJII(this.LJLJJL);
            C78966Uyw.LJJJJLL(new File(LJII));
            ArrayList arrayList = new ArrayList();
            concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap2 = new ConcurrentHashMap();
            Iterator<String> it = this.LJLJJLL.selectMediaList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                arrayList.add(XKX.LIZIZ(interfaceC70422pa, C78613UtF.LIZJ, null, new C42108Gfo(LJII, i2, it.next(), this.LJLJL, this.LJLJLJ, concurrentHashMap, concurrentHashMap2, null), 2));
                i2++;
                concurrentHashMap = concurrentHashMap;
            }
            this.LJLJJI = LJII;
            this.LJLIL = concurrentHashMap;
            this.LJLILLLLZI = concurrentHashMap2;
            this.LJLJI = 1;
            if (T1W.LIZ(arrayList, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        int i3 = this.LJLJL;
        OSZ<Integer, Integer> osz = this.LJLJLJ;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJII);
            LIZ.append(((Number) entry.getValue()).intValue());
            LIZ.append(C43075GvP.LIZ(".bmp"));
            String LIZ2 = C42111Gfr.LIZ(i3, (String) entry.getKey(), X1D.LIZIZ(LIZ), osz);
            if (LIZ2 != null) {
                concurrentHashMap2.put(entry.getKey(), LIZ2);
            }
        }
        ArrayList<String> arrayList2 = this.LJLJJLL.selectMediaList;
        o.LJIIIIZZ(arrayList2, "videoData.selectMediaList");
        ArrayList arrayList3 = new ArrayList();
        Iterator<String> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object obj2 = concurrentHashMap2.get(it2.next());
            if (obj2 != null) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            this.LJLJJLL.selectMediaList.clear();
            this.LJLJJLL.selectMediaList.addAll(arrayList3);
        }
        XIF xif = EXU.LIZ;
        C42110Gfq c42110Gfq = new C42110Gfq(this.LJLJJLL, this.LJLJLLL, null);
        this.LJLJJI = null;
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = 2;
        if (XKX.LJI(xif, c42110Gfq, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
