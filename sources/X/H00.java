package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H00 extends AbstractC43456H3s {
    public InterfaceC43351Gzr LIZ;
    public C43403H1r LIZIZ;
    public VideoCreation LIZJ;
    public SynthetiseResult LIZLLL;
    public List<String> LJ;
    public UploadImageConfig LJFF;
    public C43337Gzd LJII;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIILIIL;
    public final String LJI = "ImageModeUpload";
    public final List<AbstractImageUploader> LJIIIIZZ = new ArrayList();
    public final int LJIIJJI = 2003;
    public int LJIIL = -1;
    public final java.util.Map<String, AbstractImageUploader.ImageUploadInfo> LJIILJJIL = new LinkedHashMap();
    public final java.util.Map<String, Integer> LJIILL = new LinkedHashMap();
    public final C43366H0g LJIILLIIL = new C43366H0g(1000, false);
    public final int LJIIZILJ = C00F.LIZ(31744, 10, "photo_upload_size_config", true);
    public final C62822Ol8 LJIJ = C221108m2.LIZIZ(H04.LJLIL);
    public final C62822Ol8 LJIJI = C221108m2.LIZIZ(C43358Gzy.LJLIL);

    public final int LJI() {
        return ((Number) this.LJIJ.getValue()).intValue();
    }

    public final H07 LJFF(int i) {
        int i2 = this.LJIIZILJ + i;
        List<String> list = this.LJ;
        if (list != null) {
            return new H07(i, Math.min(i2, list.size()) - i);
        }
        o.LJIJI("imagePaths");
        throw null;
    }

    public final void LJIIIIZZ(C41767GaJ c41767GaJ) {
        int LJII = C42991Gu3.LJII(c41767GaJ);
        InterfaceC43351Gzr interfaceC43351Gzr = this.LIZ;
        if (interfaceC43351Gzr != null) {
            interfaceC43351Gzr.LIZIZ(LJII, c41767GaJ);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    public final void LJIIIZ(H07 h07) {
        try {
            UploadImageConfig uploadImageConfig = this.LJFF;
            if (uploadImageConfig != null) {
                C43859HJf c43859HJf = new C43859HJf(uploadImageConfig);
                ((ArrayList) this.LJIIIIZZ).add(c43859HJf);
                c43859HJf.LJIIJ(C45039Hlz.LIZLLL());
                H75 h75 = new H75();
                UploadImageConfig uploadImageConfig2 = this.LJFF;
                if (uploadImageConfig2 != null) {
                    h75.LIZJ(uploadImageConfig2);
                    c43859HJf.LJIIJJI(h75.LIZLLL());
                    c43859HJf.LIZIZ.setEnableLogCallBack(true);
                    c43859HJf.LIZIZ.setAbstractListener(new H05(new H02(this, h07)));
                    if (this.LJIIIZ) {
                        InterfaceC43351Gzr interfaceC43351Gzr = this.LIZ;
                        if (interfaceC43351Gzr == null) {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                        interfaceC43351Gzr.LIZJ(new H0B(LJI(), this.LJIIJ), EnumC43531H6p.OUTER);
                        c43859HJf.LIZIZ.setPreUploadEncryptionMode(LJI());
                        FFL.LJIIIZ().getClass();
                        c43859HJf.LIZIZ.setSliceSize(FFL.LJIIJ(31744, 5242880, "images_pre_upload_slice_size", true));
                        if (this.LJIIJ) {
                            Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
                            while (it.hasNext()) {
                                AbstractImageUploader abstractImageUploader = (AbstractImageUploader) it.next();
                                if (!abstractImageUploader.LIZ) {
                                    abstractImageUploader.LIZ();
                                }
                            }
                        }
                    }
                    try {
                        c43859HJf.LJIIIZ(new H01(c43859HJf, this, h07));
                        int i = h07.LIZIZ;
                        List<String> list = this.LJ;
                        if (list != null) {
                            int i2 = h07.LIZ;
                            c43859HJf.LJIIIIZZ(i, (String[]) list.subList(i2, i2 + i).toArray(new String[0]));
                            c43859HJf.LJIIL();
                            return;
                        }
                        o.LJIJI("imagePaths");
                        throw null;
                    } catch (Exception e) {
                        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
                        while (it2.hasNext()) {
                            ((AbstractImageUploader) it2.next()).LIZJ();
                        }
                        throw e;
                    }
                }
                o.LJIJI("uploadImageConfig");
                throw null;
            }
            o.LJIJI("uploadImageConfig");
            throw null;
        } catch (Exception unused) {
            LJII(new AbstractImageUploader.ImageUploadInfo(0, null, -39999L, null, null, 0L, null, 123, null), "init crash");
        }
    }

    @Override // X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        if (!(cause instanceof C42984Gtw) && this.LJIIIZ && ((ArrayList) this.LJIIIIZZ).size() > 0) {
            Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
            while (it.hasNext()) {
                ((AbstractImageUploader) it.next()).LIZIZ();
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // X.AbstractC43456H3s
    public final void LJ(ERR args, InterfaceC43351Gzr interfaceC43351Gzr) {
        Object obj;
        ?? r4;
        String str;
        o.LJIIIZ(args, "args");
        this.LIZ = interfaceC43351Gzr;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof ERL) {
                if (next != null) {
                    this.LIZJ = ((ERL) next).LJLIL;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43403H1r) {
                            if (next2 != null) {
                                this.LIZIZ = (C43403H1r) next2;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj = it3.next();
                                        if (obj instanceof C43404H1s) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    Iterator<Object> it4 = args.LIZ.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        Object next3 = it4.next();
                                        if (next3 instanceof C43397H1l) {
                                            if (next3 != null) {
                                                Iterator<Object> it5 = args.LIZ.iterator();
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        break;
                                                    }
                                                    Object next4 = it5.next();
                                                    if (next4 instanceof SynthetiseResult) {
                                                        if (next4 != null) {
                                                            this.LIZLLL = (SynthetiseResult) next4;
                                                            Iterator<Object> it6 = args.LIZ.iterator();
                                                            while (true) {
                                                                if (!it6.hasNext()) {
                                                                    break;
                                                                }
                                                                Object next5 = it6.next();
                                                                if (next5 instanceof C43404H1s) {
                                                                    if (next5 != null) {
                                                                        this.LJIIL = ((C43404H1s) next5).LIZ.publishType;
                                                                        Iterator<Object> it7 = args.LIZ.iterator();
                                                                        while (true) {
                                                                            if (!it7.hasNext()) {
                                                                                break;
                                                                            }
                                                                            Object next6 = it7.next();
                                                                            if (next6 instanceof C43458H3u) {
                                                                                if (next6 != null) {
                                                                                    C43458H3u c43458H3u = (C43458H3u) next6;
                                                                                    c43458H3u.LIZJ(new AqS157S0100000_7(this, 621));
                                                                                    if (this.LJIIL == 2 && LJI() > 0 && !c43458H3u.LIZIZ) {
                                                                                        this.LJIIIZ = true;
                                                                                    }
                                                                                    C43403H1r c43403H1r = this.LIZIZ;
                                                                                    if (c43403H1r != null) {
                                                                                        C78949Uyf.LJIIJJI(c43403H1r.LIZ, "ImageGroupUploadTask");
                                                                                        VideoCreation videoCreation = this.LIZJ;
                                                                                        if (videoCreation != null) {
                                                                                            UploadImageConfig uploadImageConfig = ((UploadAuthKeyConfig) videoCreation).photoModeUploadConfig;
                                                                                            if (uploadImageConfig == null) {
                                                                                                LJIIIIZZ(new C41767GaJ(C43339Gzf.LIZ(2001), null, 2, null));
                                                                                                return;
                                                                                            }
                                                                                            SynthetiseResult synthetiseResult = this.LIZLLL;
                                                                                            if (synthetiseResult != null) {
                                                                                                List list = synthetiseResult.imageSynthesisResult;
                                                                                                if (list != null) {
                                                                                                    r4 = new ArrayList(C32I.LJJL(list, 10));
                                                                                                    Iterator it8 = list.iterator();
                                                                                                    while (it8.hasNext()) {
                                                                                                        r4.add(((PublishImageModel) it8.next()).path);
                                                                                                    }
                                                                                                } else {
                                                                                                    r4 = C61878OQg.INSTANCE;
                                                                                                }
                                                                                                this.LJ = r4;
                                                                                                this.LJFF = uploadImageConfig;
                                                                                                if (list == null) {
                                                                                                    list = new ArrayList();
                                                                                                }
                                                                                                this.LJII = new C43337Gzd(this, list);
                                                                                                List<String> list2 = this.LJ;
                                                                                                if (list2 != null) {
                                                                                                    if (list2.isEmpty()) {
                                                                                                        C78983UzD.LJIILL("ImageGroupUploadTask empty imagePaths");
                                                                                                        LJIIIIZZ(new C41767GaJ(C43339Gzf.LIZ(-39998), null, 2, null));
                                                                                                        return;
                                                                                                    }
                                                                                                    List<String> list3 = this.LJ;
                                                                                                    if (list3 != null && (str = (String) ORZ.LJLLLLLL(0, list3)) != null) {
                                                                                                        C8SG c8sg = C8SG.LIZIZ;
                                                                                                        String imagePath = c8sg.LIZ.LJIIL(str);
                                                                                                        o.LJIIIZ(imagePath, "imagePath");
                                                                                                        c8sg.LIZ.LIZ(imagePath);
                                                                                                    }
                                                                                                    LJIIIZ(LJFF(0));
                                                                                                    return;
                                                                                                }
                                                                                                o.LJIJI("imagePaths");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("synthetiseResult");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("authKey");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("editModelContainer");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                        }
                                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                                                    }
                                                                }
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                                        }
                                                    }
                                                }
                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
                                            }
                                        }
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
    }

    public final void LJII(AbstractImageUploader.ImageUploadInfo imageUploadInfo, String str) {
        if (imageUploadInfo == null) {
            C43337Gzd c43337Gzd = this.LJII;
            if (c43337Gzd != null) {
                c43337Gzd.LIZ(new C42993Gu5(-1L, str));
                return;
            } else {
                o.LJIJI("callback");
                throw null;
            }
        }
        C43379H0t.LIZLLL(imageUploadInfo.getMErrorCode());
        C43337Gzd c43337Gzd2 = this.LJII;
        if (c43337Gzd2 != null) {
            c43337Gzd2.LIZ(new C42993Gu5(imageUploadInfo.getMErrorCode(), str));
        } else {
            o.LJIJI("callback");
            throw null;
        }
    }
}
