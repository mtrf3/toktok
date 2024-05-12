package X;

import Y.ACallableS14S0310000_7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS184S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gzk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43344Gzk extends AbstractC43349Gzp {
    public final InterfaceC65784Pro<C76800UCe> LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public final Object LJIIIZ;
    public InterfaceC43346Gzm LJIIJ;
    public VideoPublishEditModel LJIIJJI;
    public InterfaceC43351Gzr LJIIL;
    public volatile boolean LJIILIIL;
    public volatile boolean LJIILJJIL;
    public final C62822Ol8 LJIILL;

    public final void LJIIJJI() {
        List<SingleImageData> imageList;
        VideoPublishEditModel videoPublishEditModel = this.LJIIJJI;
        if (videoPublishEditModel != null) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                return;
            }
            try {
                String queryMediadata = TEImageInterface.queryMediadata(true, true, "", Boolean.TRUE);
                if (queryMediadata != null && queryMediadata.length() != 0) {
                    Object LJII = C78880UxY.LJJIJLIJ().LJII(queryMediadata, new TypeToken<HashMap<String, HashMap<String, String>>>() { // from class: X.2ZK
                    }.getType());
                    o.LJIIIIZZ(LJII, "getGson()\n              …ing, String>>>() {}.type)");
                    HashMap hashMap = (HashMap) LJII;
                    for (SingleImageData singleImageData : imageList) {
                        HashMap hashMap2 = (HashMap) hashMap.get(singleImageData.getSrcImageInfo().getPath());
                        if (hashMap2 != null) {
                            C43823HHv.LIZ(singleImageData, hashMap2);
                        }
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        o.LJIJI("editModel");
        throw null;
    }

    public final SynthetiseResult LJIIL() {
        return (SynthetiseResult) this.LJIILL.getValue();
    }

    public C43344Gzk(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(null);
        this.LJI = interfaceC65784Pro;
        this.LJIIIZ = new Object();
        this.LJIILL = C221108m2.LIZIZ(C43347Gzn.LJLIL);
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZJ(Object obj) {
        super.LIZJ(obj);
        if (!this.LJII && !this.LJIIIIZZ) {
            InterfaceC43351Gzr interfaceC43351Gzr = this.LJIIL;
            if (interfaceC43351Gzr == null) {
                o.LJIJI("nodeCallback");
                throw null;
            }
            interfaceC43351Gzr.LIZJ(new C43393H1h("ImageGroupWaveCompileTask", "CompileTask pause"), EnumC43531H6p.OUTER);
            InterfaceC43346Gzm interfaceC43346Gzm = this.LJIIJ;
            if (interfaceC43346Gzm != null) {
                interfaceC43346Gzm.pause();
                synchronized (this.LJIIIZ) {
                    this.LJII = true;
                }
                InterfaceC43351Gzr interfaceC43351Gzr2 = this.LJIIL;
                if (interfaceC43351Gzr2 == null) {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
                interfaceC43351Gzr2.LIZJ(C41764GaG.LIZ, EnumC43531H6p.OUTER);
                return true;
            }
            o.LJIJI("imageEditor");
            throw null;
        }
        return false;
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final void LIZLLL(Object obj) {
        super.LIZLLL(obj);
        if (this.LJII) {
            InterfaceC43351Gzr interfaceC43351Gzr = this.LJIIL;
            if (interfaceC43351Gzr == null) {
                o.LJIJI("nodeCallback");
                throw null;
            }
            interfaceC43351Gzr.LIZJ(new C43393H1h("ImageGroupWaveCompileTask", "CompileTask resume"), EnumC43531H6p.OUTER);
            InterfaceC43346Gzm interfaceC43346Gzm = this.LJIIJ;
            if (interfaceC43346Gzm != null) {
                interfaceC43346Gzm.resume();
                synchronized (this.LJIIIZ) {
                    this.LJIIIZ.notifyAll();
                }
                InterfaceC43351Gzr interfaceC43351Gzr2 = this.LJIIL;
                if (interfaceC43351Gzr2 == null) {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
                interfaceC43351Gzr2.LIZJ(C41763GaF.LIZ, EnumC43531H6p.OUTER);
                this.LJII = false;
                return;
            }
            o.LJIJI("imageEditor");
            throw null;
        }
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        super.LIZ(cause, c87623YaB);
        InterfaceC43346Gzm interfaceC43346Gzm = this.LJIIJ;
        if (interfaceC43346Gzm != null) {
            interfaceC43346Gzm.cancel();
            this.LJIILIIL = true;
            SynthetiseResult m157clone = LJIIL().m157clone();
            o.LJIIIIZZ(m157clone, "synthetiseResult.clone()");
            m157clone.ret = -66666;
            if (!this.LJIILJJIL) {
                this.LJIILJJIL = true;
                InterfaceC43351Gzr interfaceC43351Gzr = this.LJIIL;
                if (interfaceC43351Gzr != null) {
                    C43342Gzi c43342Gzi = new C43342Gzi();
                    c43342Gzi.LIZ = m157clone;
                    c43342Gzi.LIZJ = "Compiler canceled";
                    C41658GWo.LIZLLL().getClass();
                    interfaceC43351Gzr.LIZIZ(-66666, c43342Gzi.LIZ());
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            c87623YaB.LIZ(null);
            return true;
        }
        o.LJIJI("imageEditor");
        throw null;
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final void LJ(ERR args, InterfaceC43351Gzr interfaceC43351Gzr) {
        int i;
        o.LJIIIZ(args, "args");
        super.LJ(args, interfaceC43351Gzr);
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJIIJJI = ((C43403H1r) next).LIZ;
                    this.LJIIL = interfaceC43351Gzr;
                    if (GOX.LIZ()) {
                        C60903NvH.LJIIJJI().LJJII();
                    }
                    try {
                        C152875zH LIZ = LJII().LIZ();
                        VideoPublishEditModel videoPublishEditModel = this.LJIIJJI;
                        if (videoPublishEditModel != null) {
                            C152955zP LIZJ = LIZ.LIZJ(videoPublishEditModel);
                            if (LIZJ != null) {
                                this.LJIIJ = LIZJ;
                                LJIIL().isImageMode = true;
                                VideoPublishEditModel videoPublishEditModel2 = this.LJIIJJI;
                                if (videoPublishEditModel2 != null) {
                                    if (videoPublishEditModel2.isSaveLocalWithWaterMark()) {
                                        i = 20;
                                    } else {
                                        i = 0;
                                    }
                                    float f = 100.0f - i;
                                    if (this.LJIIJJI != null) {
                                        float size = f / r0.getImageAlbumData().getImageList().size();
                                        C56K c56k = new C56K();
                                        InterfaceC43346Gzm interfaceC43346Gzm = this.LJIIJ;
                                        if (interfaceC43346Gzm != null) {
                                            if (!interfaceC43346Gzm.LIZ()) {
                                                SynthetiseResult LJIIL = LJIIL();
                                                VideoPublishEditModel videoPublishEditModel3 = this.LJIIJJI;
                                                if (videoPublishEditModel3 != null) {
                                                    List<SingleImageData> imageList = videoPublishEditModel3.getImageAlbumData().getImageList();
                                                    ArrayList arrayList = new ArrayList(C32I.LJJL(imageList, 10));
                                                    Iterator<SingleImageData> it2 = imageList.iterator();
                                                    while (it2.hasNext()) {
                                                        ImageSynthesisResult synthesisData = it2.next().getSynthesisData();
                                                        if (synthesisData != null) {
                                                            arrayList.add(new PublishImageModel(synthesisData.getPath(), synthesisData.getWidth(), synthesisData.getHeight(), null, 8, null));
                                                        } else {
                                                            "Required value was null.".toString();
                                                            throw new IllegalArgumentException("Required value was null.");
                                                        }
                                                    }
                                                    LJIIL.imageSynthesisResult = arrayList;
                                                    LJIIJJI();
                                                    List<PublishImageModel> list = LJIIL().imageSynthesisResult;
                                                    if (list == null) {
                                                        list = C61878OQg.INSTANCE;
                                                    }
                                                    LJIILIIL(list, true);
                                                    return;
                                                }
                                                o.LJIJI("editModel");
                                                throw null;
                                            }
                                            InterfaceC43346Gzm interfaceC43346Gzm2 = this.LJIIJ;
                                            if (interfaceC43346Gzm2 != null) {
                                                VideoPublishEditModel videoPublishEditModel4 = this.LJIIJJI;
                                                if (videoPublishEditModel4 != null) {
                                                    C87618Ya6 c87618Ya6 = (C87618Ya6) interfaceC43351Gzr;
                                                    interfaceC43346Gzm2.LIZIZ(videoPublishEditModel4, new C43345Gzl(this, c56k, size, c87618Ya6), new IDqS184S0200000_7(this, c87618Ya6, 5), new AqS173S0100000_7(this, 347));
                                                    return;
                                                } else {
                                                    o.LJIJI("editModel");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("imageEditor");
                                            throw null;
                                        }
                                        o.LJIJI("imageEditor");
                                        throw null;
                                    }
                                    o.LJIJI("editModel");
                                    throw null;
                                }
                                o.LJIJI("editModel");
                                throw null;
                            }
                            return;
                        }
                        o.LJIJI("editModel");
                        throw null;
                    } catch (Exception e) {
                        C43342Gzi c43342Gzi = new C43342Gzi();
                        c43342Gzi.LIZ = C43217Gxh.LIZIZ(100104);
                        c43342Gzi.LIZLLL = e;
                        C42990Gu2 LIZ2 = c43342Gzi.LIZ();
                        if (!this.LJIILJJIL) {
                            this.LJIILJJIL = true;
                            InterfaceC43351Gzr interfaceC43351Gzr2 = this.LJIIL;
                            if (interfaceC43351Gzr2 != null) {
                                interfaceC43351Gzr2.LIZIZ(LIZ2.getCode(), LIZ2);
                                return;
                            } else {
                                o.LJIJI("nodeCallback");
                                throw null;
                            }
                        }
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIILIIL(List<PublishImageModel> list, boolean z) {
        VideoPublishEditModel videoPublishEditModel = this.LJIIJJI;
        if (videoPublishEditModel != null) {
            if (!videoPublishEditModel.isSaveLocal()) {
                this.LJIIIIZZ = true;
                InterfaceC43351Gzr interfaceC43351Gzr = this.LJIIL;
                if (interfaceC43351Gzr != null) {
                    interfaceC43351Gzr.LIZJ(new C41855Gbj(1.0f), EnumC43531H6p.OUTER);
                    LJIILJJIL(LJIIL(), z);
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            } else {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<PublishImageModel> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().path);
                }
                SynthetiseResult LJIIL = LJIIL();
                VideoPublishEditModel videoPublishEditModel2 = this.LJIIJJI;
                if (videoPublishEditModel2 != null) {
                    if (videoPublishEditModel2.isSaveLocalWithoutWaterMark()) {
                        VideoPublishEditModel videoPublishEditModel3 = this.LJIIJJI;
                        if (videoPublishEditModel3 != null) {
                            AVUploadSaveModel saveModel = videoPublishEditModel3.getSaveModel();
                            if (saveModel != null) {
                                saveModel.setImageModeLocalPaths(ORZ.LLJI(arrayList));
                            }
                            InterfaceC43351Gzr interfaceC43351Gzr2 = this.LJIIL;
                            if (interfaceC43351Gzr2 != null) {
                                interfaceC43351Gzr2.LIZJ(new C41855Gbj(1.0f), EnumC43531H6p.OUTER);
                                this.LJIIIIZZ = true;
                                LJIILJJIL(LJIIL, z);
                            } else {
                                o.LJIJI("nodeCallback");
                                throw null;
                            }
                        } else {
                            o.LJIJI("editModel");
                            throw null;
                        }
                    } else {
                        C10K.LIZJ(new ACallableS14S0310000_7(this, arrayList, LJIIL, z, 0));
                    }
                } else {
                    o.LJIJI("editModel");
                    throw null;
                }
            }
            if (!GOX.LIZ() || (!list.isEmpty())) {
                InterfaceC43351Gzr interfaceC43351Gzr3 = this.LJIIL;
                if (interfaceC43351Gzr3 != null) {
                    interfaceC43351Gzr3.LIZJ(new C41762GaE(((PublishImageModel) ListProtector.get(list, 0)).path), EnumC43531H6p.OUTER);
                    return;
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("editModel");
        throw null;
    }

    public final void LJIILJJIL(SynthetiseResult synthetiseResult, boolean z) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        InterfaceC43351Gzr interfaceC43351Gzr = this.LJIIL;
        if (interfaceC43351Gzr != null) {
            interfaceC43351Gzr.LIZ(synthetiseResult, z);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }
}
