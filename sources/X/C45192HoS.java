package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HoS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45192HoS extends C45131HnT {
    public final /* synthetic */ List<InterfaceC45209Hoj> LJFF;
    public final /* synthetic */ boolean LJI;
    public final /* synthetic */ AbstractC45196HoW LJII;
    public final /* synthetic */ EnumC45070HmU LJIIIIZZ;
    public final /* synthetic */ int LJIIIZ;
    public final /* synthetic */ String LJIIJ;
    public final /* synthetic */ String LJIIJJI;
    public final /* synthetic */ String LJIIL;
    public final /* synthetic */ String LJIILIIL;

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressDone(VecMeta vecMeta) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJIIIZ());
        LIZ.append(" requestNLEModel onCompressDone: ");
        VecMeta vecMeta2 = vecMeta;
        if (vecMeta2 != null) {
            vecMeta2 = vecMeta2;
            str = ORZ.LLD(vecMeta2, null, null, null, C45195HoV.LJLIL, 31);
        } else {
            str = null;
        }
        C45243HpH.LIZIZ(LIZ, str, LIZ);
        Iterator<InterfaceC45209Hoj> it = this.LJFF.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ("compress");
        }
        if (vecMeta2 != null) {
            for (InterfaceC45209Hoj interfaceC45209Hoj : this.LJFF) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(vecMeta2, 10));
                Iterator<Meta> it2 = vecMeta2.iterator();
                while (it2.hasNext()) {
                    Meta next = it2.next();
                    String path = next.LIZLLL();
                    int LJ = (int) next.LJ();
                    int LIZJ = (int) next.LIZJ();
                    long LIZIZ = next.LIZIZ();
                    boolean LJFF = next.LJFF();
                    o.LJIIIIZZ(path, "path");
                    arrayList.add(new AutoCutMediaModel(path, null, LJ, LIZJ, LJFF, LIZIZ, 0L, 0L, 0.0f, null, 962, null));
                }
                interfaceC45209Hoj.LJIIJJI(arrayList);
            }
        }
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJIIIZ());
        LIZ.append(" requestNLEModel onCompressProgress progress: ");
        LIZ.append(f);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFetchProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJIIIZ());
        LIZ.append(" requestNLEModel onFetchProgress: progress = ");
        LIZ.append(f);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onNeedFetch(VecStr vecStr) {
        int i;
        StringBuilder sb = new StringBuilder();
        Integer num = null;
        if (vecStr != null) {
            Iterator<String> it = vecStr.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = next;
                    if (i2 != 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJIIIZ());
        LIZ.append(" ASYNC_RENDER: Necessary Count=");
        if (vecStr != null) {
            num = Integer.valueOf(vecStr.size());
        }
        LIZ.append(num);
        LIZ.append(" onNeedFetch effect: ");
        LIZ.append((Object) sb);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LJII.LJIILJJIL = 0;
        if (this.LJIIIIZZ != EnumC45070HmU.TEMPLATE_CC) {
            for (InterfaceC45209Hoj interfaceC45209Hoj : this.LJFF) {
                if (vecStr != null) {
                    i = vecStr.size();
                } else {
                    i = 0;
                }
                interfaceC45209Hoj.LJIJ(i);
                interfaceC45209Hoj.LJFF("download_effect");
            }
        }
    }

    @Override // X.C45131HnT
    public final void LIZ(NLEModel nLEModel, java.util.Map<String, String> map) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        Integer valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJIIIZ());
        LIZ.append(" requestNLEModel onSuccess: ");
        LIZ.append(nLEModel);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        AbstractC45196HoW abstractC45196HoW = this.LJII;
        abstractC45196HoW.LJIIL = 1.0f;
        List<InterfaceC45209Hoj> list = this.LJFF;
        String str2 = this.LJIIL;
        String str3 = this.LJIILIIL;
        String str4 = this.LJIIJ;
        String str5 = this.LJIIJJI;
        int i5 = this.LJIIIZ;
        EnumC45070HmU enumC45070HmU = this.LJIIIIZZ;
        for (InterfaceC45209Hoj interfaceC45209Hoj : list) {
            String LJJI = C45087Hml.LJJI(map);
            if (LJJI == null) {
                LJJI = str5;
            }
            Integer LJJIFFI = C45087Hml.LJJIFFI(map);
            if (LJJIFFI != null) {
                i2 = LJJIFFI.intValue();
            } else {
                i2 = i5;
            }
            if (map != null && (str = map.get("text_sticker_duration")) != null && (valueOf = Integer.valueOf(CastIntegerProtector.parseInt(str))) != null) {
                i3 = valueOf.intValue();
            } else {
                i3 = 0;
            }
            interfaceC45209Hoj.LJ(str2, str3, i2, i3, str4, LJJI);
            if (enumC45070HmU != EnumC45070HmU.TEMPLATE_CC) {
                int i6 = abstractC45196HoW.LJIILJJIL;
                String LJJI2 = C45087Hml.LJJI(map);
                if (LJJI2 == null) {
                    LJJI2 = str5;
                }
                Integer LJJIFFI2 = C45087Hml.LJJIFFI(map);
                if (LJJIFFI2 != null) {
                    i4 = LJJIFFI2.intValue();
                } else {
                    i4 = i5;
                }
                interfaceC45209Hoj.LJIIL(i6, i4, str2, str4, LJJI2);
                interfaceC45209Hoj.LJIIJ("download_effect");
            }
        }
        AbstractC45196HoW abstractC45196HoW2 = this.LJII;
        abstractC45196HoW2.LJIIIIZZ = null;
        C44716Hgm c44716Hgm = abstractC45196HoW2.LJI;
        if (c44716Hgm != null) {
            c44716Hgm.LJII = nLEModel;
            c44716Hgm.LJI = C45087Hml.LJIILLIIL(nLEModel);
        }
        C44716Hgm c44716Hgm2 = this.LJII.LJI;
        if (c44716Hgm2 != null) {
            Integer LJJIFFI3 = C45087Hml.LJJIFFI(map);
            if (LJJIFFI3 != null) {
                i = LJJIFFI3.intValue();
            } else {
                i = this.LJIIIZ;
            }
            c44716Hgm2.LIZJ = i;
        }
        C44716Hgm c44716Hgm3 = this.LJII.LJI;
        if (c44716Hgm3 != null) {
            c44716Hgm3.LJIIIZ = this.LJIIJ;
            String LJJI3 = C45087Hml.LJJI(map);
            if (LJJI3 == null) {
                LJJI3 = this.LJIIJJI;
            }
            c44716Hgm3.LJIIJJI = LJJI3;
        }
        this.LJII.LJIIL(this.LJFF);
    }

    @Override // X.C45131HnT, com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        super.onResponse(nLEModel, unorderedMapStrStr);
        if (this.LJI) {
            long LIZ = C00F.LIZ(31744, 0, "autocut_progressive_render_necessary_time", true);
            AbstractC45196HoW abstractC45196HoW = this.LJII;
            NLEMediaPublicJniJNI.NLERenderResourceUtil_setNLEResourceNecessary(NLEModel.getCPtr(nLEModel), nLEModel, 128L, LIZ);
            abstractC45196HoW.LJIIIZ();
        }
        for (InterfaceC45209Hoj interfaceC45209Hoj : this.LJFF) {
            interfaceC45209Hoj.LIZ(nLEModel);
            interfaceC45209Hoj.LJIIJ("nlemodel_request_success");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJII.LJIIIZ());
        LIZ2.append(" requestNLEModel onResponse: ");
        LIZ2.append(nLEModel);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
    }

    @Override // X.C45131HnT
    public final void LIZIZ(int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJIIIZ());
        LIZ.append(" requestNLEModel onTemplateFailure: ");
        LIZ.append(i);
        LIZ.append(", ");
        LIZ.append(i2);
        LIZ.append(", ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        AbstractC45196HoW.LJIIJ(this.LJII, i, Integer.valueOf(i2), str, null, 8);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJII.LJIIIZ());
        LIZ.append(" requestNLEModel onFailure: ");
        LIZ.append(i);
        LIZ.append(", ");
        LIZ.append(str2);
        LIZ.append(", extraParams=");
        LIZ.append(unorderedMapStrStr);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            AbstractC45196HoW.LJIIJ(this.LJII, i, null, str2, unorderedMapStrStr, 2);
            return;
        }
        this.LJII.LJIILJJIL++;
        C45049Hm9.LJIIL("source_auto_cut", str, i, str2, unorderedMapStrStr);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJII.LJIIIZ());
        LIZ2.append(" ASYNC_RENDER: Necessary onFailure urs=");
        LIZ2.append(str);
        LIZ2.append(", code=");
        LIZ2.append(i);
        LIZ2.append(", msg=");
        LIZ2.append(str2);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C45192HoS(List<? extends InterfaceC45209Hoj> list, boolean z, AbstractC45196HoW abstractC45196HoW, EnumC45070HmU enumC45070HmU, int i, String str, String str2, String str3, String str4) {
        super(list);
        this.LJFF = list;
        this.LJI = z;
        this.LJII = abstractC45196HoW;
        this.LJIIIIZZ = enumC45070HmU;
        this.LJIIIZ = i;
        this.LJIIJ = str;
        this.LJIIJJI = str2;
        this.LJIIL = str3;
        this.LJIILIIL = str4;
    }
}
