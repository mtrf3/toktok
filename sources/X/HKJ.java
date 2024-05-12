package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HKJ extends AbstractC29891Fh<HKN> implements HKN {
    public static final HKS LJLLILLLL = new HKS();
    public final WMH LJLIL;
    public final HKN LJLILLLLZI;
    public final C5H3 LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public HKO LJLJJLL;
    public List<? extends MediaModel> LJLJL;
    public CreativeInfo LJLJLJ;
    public InterfaceC79150V4o LJLJLLL;
    public final HKM LJLL;
    public final HKM LJLLI;

    @Override // X.HKN
    public void LJJJLL() {
        LJLJJL(null, null, null, null, null);
        InterfaceC79150V4o interfaceC79150V4o = this.LJLJLLL;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        HKM hkm = this.LJLL;
        hkm.LJLIL = 0.0f;
        hkm.LJLILLLLZI = 0.0f;
        hkm.LJLJI = 0.0f;
        hkm.LJLJJI = 0.0f;
        hkm.LJLJJL = 0.0f;
        HKQ hkq = LJJZZI().LJIIIIZZ;
        if (hkq != null) {
            hkq.LJI(null);
        }
        C6QQ.LIZ(new AqS157S0100000_7(this, 460));
    }

    private final int LJJLIIIIJ() {
        HKM hkm = this.LJLL;
        float f = hkm.LJLIL;
        HKM hkm2 = this.LJLLI;
        return (int) (((hkm.LJLJJI * hkm2.LJLJJI) + ((hkm.LJLJJL * hkm2.LJLJJL) + ((hkm.LJLJI * hkm2.LJLJI) + ((hkm.LJLILLLLZI * hkm2.LJLILLLLZI) + (f * hkm2.LJLIL))))) / 100);
    }

    public final void LJJLIIIJILLIZJL() {
        HKO hko = this.LJLJJLL;
        if (hko != null) {
            hko.LIZIZ(new C43645HAz(null, LJJLIIIIJ(), null, 13), false);
        }
    }

    public final C44044HQi LJJZZI() {
        return (C44044HQi) this.LJLJI.getValue();
    }

    public final void LJJZZIII() {
        HKQ hkq = LJJZZI().LJIIIIZZ;
        if (hkq != null) {
            hkq.LJI(null);
        }
        HKM hkm = this.LJLL;
        hkm.LJLIL = 0.0f;
        hkm.LJLILLLLZI = 0.0f;
        hkm.LJLJI = 0.0f;
        hkm.LJLJJI = 0.0f;
        hkm.LJLJJL = 0.0f;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ HKN getApiComponent() {
        return this.LJLILLLLZI;
    }

    public HKJ(WMH parentScene) {
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = this;
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 461));
        this.LJLL = new HKM(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.LJLLI = new HKM(10.0f, 0.0f, 30.0f, 60.0f, 0.0f);
    }

    private final boolean LJLIIL(HJU hju) {
        return !C1DH.LIZIZ(new VideoSegment(hju.LIZ, hju.LJII, hju.LJIIIIZZ, hju.LIZLLL));
    }

    private final void LJJLJLI(long j, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C68612mf(this, j, interfaceC88472Yns, null), 3);
    }

    public final NLEModel LJJLI(NLETemplateModel nLETemplateModel, List<HJU> list) {
        EnumC123874tb enumC123874tb;
        if (list.isEmpty() || nLETemplateModel == null) {
            return null;
        }
        NLETemplateModel restore = NLETemplateModel.restore(nLETemplateModel.store());
        Context LIZ = C5L7.LIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (HJU hju : list) {
            String str = hju.LIZIZ;
            if (hju.LIZJ) {
                enumC123874tb = EnumC123874tb.VIDEO;
            } else {
                enumC123874tb = EnumC123874tb.IMAGE;
            }
            arrayList.add(new C5SB(str, enumC123874tb, hju.LIZLLL, hju.LJI, hju.LJ, hju.LJFF));
        }
        C146045oG.LIZIZ(LIZ, restore, arrayList);
        return NLETemplateModel.saveToDraft(restore);
    }

    public final List<HJU> LJJLL(List<HJU> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(ListProtector.get(list, i2 % list.size()));
        }
        return arrayList;
    }

    @Override // X.HKN
    public void Ch(String templateId, String musicId, HKO hko) {
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(musicId, "musicId");
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateComp preDownload");
        LJLJJL(templateId, musicId, null, null, hko);
        HKM hkm = this.LJLL;
        hkm.LJLIL = 0.0f;
        hkm.LJLILLLLZI = 0.0f;
        hkm.LJLJI = 0.0f;
        hkm.LJLJJI = 0.0f;
        hkm.LJLJJL = 0.0f;
        LJJZZI().LIZ(templateId, musicId, new HKK(hko, this));
    }

    public final Object LJJLIIIJJI(Context context, List<HJU> list, InterfaceC67352kd<? super OSZ<Boolean, Long>> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateComp#compressImages: imgList = ");
        LIZ.append(ORZ.LLD(list, null, null, null, C68812mz.LJLIL, 31));
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        for (HJU hju : list) {
            String srcImage = hju.LIZ;
            String dstImage = hju.LIZIZ;
            o.LJIIIZ(context, "context");
            o.LJIIIZ(srcImage, "srcImage");
            o.LJIIIZ(dstImage, "dstImage");
            C45272Hpk.LIZ(context, srcImage, 1920, dstImage);
        }
        OSZ osz = new OSZ(Boolean.TRUE, new Long(System.currentTimeMillis() - currentTimeMillis));
        C3C5.m7constructorimpl(osz);
        c84654XKg.resumeWith(osz);
        return c84654XKg.LIZ();
    }

    public final Object LJJLJ(String str, String str2, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C68602me(str, str2, null), interfaceC67352kd);
    }

    private final void LJJLIIIJJIZ(Context context, List<? extends MediaModel> list, CreativeInfo creativeInfo, InterfaceC68662mk interfaceC68662mk) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateComp#compressMedias: mediaList = ");
        C45243HpH.LIZIZ(LIZ, ORZ.LLD(list, null, null, null, C118314kd.LJLIL, 31), LIZ);
        InterfaceC79150V4o interfaceC79150V4o = this.LJLJLLL;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (MediaModel mediaModel : list) {
            AutoCutMediaModel.Companion.getClass();
            AutoCutMediaModel LIZ2 = C63B.LIZ(context, mediaModel);
            if (C44687HgJ.LIZIZ(LIZ2.filePath)) {
                str = LIZ2.filePath;
            } else {
                str = LIZ2.fileUriPath;
            }
            String LJIIJ = C45087Hml.LJIIJ(str, LIZ2.duration, LIZ2.isVideoType, creativeInfo);
            if (str == null) {
                str = "";
            }
            arrayList.add(new HJU(str, LJIIJ, LIZ2.isVideoType, (int) mediaModel.duration, mediaModel.startTime, mediaModel.endTime, mediaModel.speed, mediaModel.width, mediaModel.height));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                HJU hju = (HJU) it.next();
                if (hju.LIZ.length() == 0 || !C44687HgJ.LIZIZ(hju.LIZ)) {
                    if (interfaceC68662mk != null) {
                        interfaceC68662mk.onFailure();
                        return;
                    }
                    return;
                }
            }
        }
        this.LJLJLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C68642mi(arrayList, interfaceC68662mk, currentTimeMillis, this, context, creativeInfo, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a8 -> B:14:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c0 -> B:14:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIJ(android.content.Context r22, java.util.List<X.HJU> r23, java.lang.String r24, X.InterfaceC67352kd<? super X.OSZ<java.lang.Boolean, java.lang.Long>> r25) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HKJ.LJJLIIJ(android.content.Context, java.util.List, java.lang.String, X.2kd):java.lang.Object");
    }

    public final void LJLJJL(String str, String str2, List<? extends MediaModel> list, CreativeInfo creativeInfo, HKO hko) {
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJL = list;
        this.LJLJLJ = creativeInfo;
        this.LJLJJLL = hko;
    }

    public final Object LJJLIIIJLLLLLLLZ(Context context, int i, String str, String str2, String str3, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C68732mr(context, i, str, str2, str3, null), interfaceC67352kd);
    }

    @Override // X.HKN
    public void ho0(String templateId, String str, List<? extends MediaModel> mediaList, CreativeInfo creativeInfo, int i, HKO hko) {
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(mediaList, "mediaList");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateComp#downloadWithLoading: templateId = ");
        LIZ.append(templateId);
        LIZ.append(", musicId = ");
        LIZ.append(str);
        LIZ.append(", mediaList = ");
        C45243HpH.LIZIZ(LIZ, ORZ.LLD(mediaList, null, null, null, HEH.LJLIL, 31), LIZ);
        if (creativeInfo == null) {
            return;
        }
        LJLJJL(templateId, str, mediaList, creativeInfo, hko);
        HKM hkm = this.LJLL;
        hkm.LJLIL = 0.0f;
        hkm.LJLILLLLZI = 0.0f;
        hkm.LJLJI = 0.0f;
        hkm.LJLJJI = 0.0f;
        hkm.LJLJJL = 0.0f;
        Activity activity = this.LJLIL.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        LJJLJLI(40L, new AqS173S0100000_7(this, 241));
        if (hko != null) {
            hko.LIZ(templateId, str, false);
        }
        Activity activity2 = this.LJLIL.mActivity;
        if (activity2 == null) {
            return;
        }
        if (hko != null) {
            hko.LIZJ(mediaList);
        }
        LJJLIIIJJIZ(activity2, mediaList, creativeInfo, new HKI(this, hko, templateId, str, i));
    }
}
