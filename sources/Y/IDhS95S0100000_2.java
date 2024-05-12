package Y;

import X.AbstractC73672Svk;
import X.C07780Sg;
import X.C147295qH;
import X.C162466Ze;
import X.C168966k8;
import X.C32I;
import X.C44687HgJ;
import X.C60903NvH;
import X.C78496UrM;
import X.C78934UyQ;
import X.C79155V4t;
import X.C82237WPh;
import X.C82268WQm;
import X.H7R;
import X.InterfaceC48038ItG;
import X.InterfaceC86003Zc;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.OUR;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDhS95S0100000_2 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object apply$9(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        return ((InterfaceC88472Yns) iDhS95S0100000_2.l0).invoke(obj);
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            default:
                return null;
        }
    }

    public IDhS95S0100000_2(VideoPublishEditModel videoPublishEditModel, int i) {
        this.$t = i;
        switch (i) {
            case 0:
                this.l0 = videoPublishEditModel;
                return;
            default:
                this.l0 = videoPublishEditModel;
                return;
        }
    }

    public static final Object apply$0(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        return OUR.LIZJ((VideoPublishEditModel) iDhS95S0100000_2.l0, (Bitmap) obj);
    }

    public static final Object apply$1(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o.LJIIIZ(bitmap, "bitmap");
        VideoPublishEditModel videoPublishEditModel = ((C147295qH) iDhS95S0100000_2.l0).LJLLJ;
        if (videoPublishEditModel != null) {
            return OUR.LIZJ(videoPublishEditModel, bitmap);
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object apply$2(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o.LJIIIZ(bitmap, "bitmap");
        C147295qH c147295qH = (C147295qH) iDhS95S0100000_2.l0;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width != 0) {
            VideoPublishEditModel videoPublishEditModel = c147295qH.LJLLJ;
            if (videoPublishEditModel != null) {
                if (videoPublishEditModel.videoWidth() == 0) {
                    return bitmap;
                }
                VideoPublishEditModel videoPublishEditModel2 = c147295qH.LJLLJ;
                if (videoPublishEditModel2 != null) {
                    int videoHeight = videoPublishEditModel2.videoHeight() * width;
                    VideoPublishEditModel videoPublishEditModel3 = c147295qH.LJLLJ;
                    if (videoPublishEditModel3 != null) {
                        int videoWidth = videoHeight / videoPublishEditModel3.videoWidth();
                        int height2 = (int) ((bitmap.getHeight() - videoWidth) / 2.0f);
                        if (height2 + videoWidth > height) {
                            return bitmap;
                        }
                        Bitmap cropBitmap = Bitmap.createBitmap(bitmap, 0, height2, width, videoWidth);
                        VideoPublishEditModel videoPublishEditModel4 = c147295qH.LJLLJ;
                        if (videoPublishEditModel4 != null) {
                            EffectTextModel effectTextModel = videoPublishEditModel4.getCoverPublishModel().getEffectTextModel();
                            VideoPublishEditModel videoPublishEditModel5 = c147295qH.LJLLJ;
                            if (videoPublishEditModel5 != null) {
                                if (H7R.LJJLIIIJJIZ(videoPublishEditModel5)) {
                                    o.LJIIIIZZ(cropBitmap, "cropBitmap");
                                    cropBitmap = c147295qH.LLLLIIIILLL(cropBitmap);
                                }
                                o.LJIIIIZZ(cropBitmap, "if (mModel.isTextMode())…opBitmap) else cropBitmap");
                                return effectTextModel.mergeCoverText(cropBitmap);
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        return bitmap;
    }

    public static final Object apply$3(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o.LJIIIZ(bitmap, "bitmap");
        VideoPublishEditModel videoPublishEditModel = ((C147295qH) iDhS95S0100000_2.l0).LJLLJ;
        if (videoPublishEditModel != null) {
            return OUR.LIZJ(videoPublishEditModel, bitmap);
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final Object apply$4(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        final AVMusic it = (AVMusic) obj;
        o.LJIIIZ(it, "it");
        final C162466Ze c162466Ze = (C162466Ze) iDhS95S0100000_2.l0;
        c162466Ze.getClass();
        String LJIIJJI = C78934UyQ.LJLIL.getMusicService().LJIIJJI(it);
        if (C44687HgJ.LIZIZ(LJIIJJI) && C78496UrM.LIZ(LJIIJJI) > 0) {
            return AbstractC73672Svk.LJJIIJZLJL(new ACallableS29S1100000_1(it, LJIIJJI, 0));
        }
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.6Zc
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<OSZ<AVMusic, String>> interfaceC73573Su9) {
                C162466Ze c162466Ze2 = C162466Ze.this;
                AVMusic aVMusic = it;
                C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                final AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(c73433Srt, aVMusic, 66);
                final AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(c73433Srt, 247);
                if (c162466Ze2.LIZJ == null) {
                    aqS168S0100000_2.invoke("not init");
                    return;
                }
                HNW LJJIJ = C60903NvH.LJIIJJI().LJJIJ();
                Context context = c162466Ze2.LIZJ;
                o.LJI(context);
                LJJIJ.LJIILL(context, aVMusic, 6, false, new InterfaceC84897XTp() { // from class: X.6Zd
                    @Override // X.InterfaceC84897XTp
                    public final void onProgress(int i) {
                    }

                    @Override // X.InterfaceC84897XTp
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC84897XTp
                    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
                        o.LJIIIZ(musicFile, "musicFile");
                        aqS133S0200000_2.invoke(musicFile);
                    }

                    @Override // X.InterfaceC84897XTp
                    public final void LIZIZ(Integer num, String str) {
                        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = aqS168S0100000_2;
                        if (str == null) {
                            str = "";
                        }
                        interfaceC88472Yns.invoke(str);
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$5(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        OSZ osz = (OSZ) obj;
        o.LJIIIZ(osz, "<name for destructuring parameter 0>");
        List list = (List) osz.getFirst();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Effect(((InfoStickerEffect) it.next()).getLoki_effect()));
        }
        InterfaceC88472Yns<Effect, Boolean> interfaceC88472Yns = ((InfoStickerListRecommendViewModel) iDhS95S0100000_2.l0).LJLLI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Boolean) interfaceC88472Yns.invoke(next)).booleanValue()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final Object apply$6(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o.LJIIIZ(bitmap, "bitmap");
        return OUR.LIZJ((VideoPublishEditModel) iDhS95S0100000_2.l0, bitmap);
    }

    public static final Object apply$7(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        C79155V4t c79155V4t;
        AbstractC73672Svk<C82268WQm> LJIL;
        C82237WPh filterData = (C82237WPh) obj;
        o.LJIIIZ(filterData, "filterData");
        ArrayList arrayList = (ArrayList) iDhS95S0100000_2.l0;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator<C79155V4t> it2 = filterData.LJLIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c79155V4t = it2.next();
                    if (o.LJ(String.valueOf(c79155V4t.LIZ), str)) {
                        break;
                    }
                } else {
                    c79155V4t = null;
                    break;
                }
            }
            C79155V4t c79155V4t2 = c79155V4t;
            if (c79155V4t2 != null && (LJIL = C60903NvH.LJIIJJI().LJIILL().LJI().LJIL(c79155V4t2)) != null) {
                arrayList2.add(LJIL);
            } else {
                StringBuilder LIZIZ = C07780Sg.LIZIZ("prepareFilterResource selectedFilterId : ", str, " not find In filters : ");
                List<C79155V4t> list = filterData.LJLIL;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
                Iterator<C79155V4t> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Integer.valueOf(it3.next().LIZ));
                }
                LIZIZ.append(arrayList3);
                throw new RuntimeException(LIZIZ.toString());
            }
        }
        return AbstractC73672Svk.LJJIJLIJ(ORZ.LLJI(arrayList2));
    }

    public static final Object apply$8(IDhS95S0100000_2 iDhS95S0100000_2, Object obj) {
        C79155V4t c79155V4t;
        AbstractC73672Svk<C82268WQm> LJIL;
        C82237WPh filterData = (C82237WPh) obj;
        o.LJIIIZ(filterData, "filterData");
        ArrayList<String> arrayList = ((C168966k8) iDhS95S0100000_2.l0).LIZJ;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Iterator<C79155V4t> it2 = filterData.LJLIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c79155V4t = it2.next();
                    if (o.LJ(String.valueOf(c79155V4t.LIZ), next)) {
                        break;
                    }
                } else {
                    c79155V4t = null;
                    break;
                }
            }
            C79155V4t c79155V4t2 = c79155V4t;
            if (c79155V4t2 != null && (LJIL = C60903NvH.LJIIJJI().LJIILL().LJI().LJIL(c79155V4t2)) != null) {
                arrayList2.add(LJIL);
            } else {
                StringBuilder LIZIZ = C07780Sg.LIZIZ("selectedFilterId : ", next, " not find In filters : ");
                List<C79155V4t> list = filterData.LJLIL;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
                Iterator<C79155V4t> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Integer.valueOf(it3.next().LIZ));
                }
                LIZIZ.append(arrayList3);
                throw new RuntimeException(LIZIZ.toString());
            }
        }
        return AbstractC73672Svk.LJJIJLIJ(ORZ.LLJI(arrayList2));
    }

    public IDhS95S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
