package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerBitrateToResolution;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VESize;
import defpackage.e1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hif, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44833Hif {
    public final ShortVideoContext LIZ;

    public final int[] LIZJ() {
        int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
        if (LJIIIZ == null || !e1.LIZ(31744, "render_use_videosize_index", true, false)) {
            LJIIIZ = new int[]{720, 1280};
        }
        if (this.LIZ.creativeModel.nowsShootModel == null) {
            return LJIIIZ;
        }
        return new int[]{LJIIIZ[0], (int) (LJIIIZ[0] / 0.75f)};
    }

    public final boolean LIZ() {
        boolean z;
        String str;
        String str2 = this.LIZ.cameraComponentModel.duetContext.duetAudioPath;
        if (str2 == null || str2.length() == 0 || (str = this.LIZ.cameraComponentModel.duetContext.duetVideoPath) == null || str.length() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!C143225ji.LIZ() || z || e1.LIZ(31744, "studio_full_screen_without_downgrade_sticker_resolution", true, false)) {
            return false;
        }
        return true;
    }

    public C44833Hif(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = shortVideoContext;
    }

    public static float LIZIZ(VESize vESize) {
        String str;
        List<StickerBitrateToResolution> list = (List) C44837Hij.LIZ.getValue();
        if (vESize.width >= 720) {
            str = C79146V4k.LJJIJIIJI(vESize);
        } else {
            str = "576x1024";
        }
        if (list != null) {
            for (StickerBitrateToResolution stickerBitrateToResolution : list) {
                if (o.LJ(stickerBitrateToResolution.resolution, str)) {
                    return stickerBitrateToResolution.bitrate;
                }
            }
        }
        return C44739Hh9.LJI(false);
    }

    public final VESize LIZLLL(String str) {
        boolean z;
        boolean z2;
        VESize vESize;
        String LIZIZ;
        List<String> list;
        List LLILII;
        int[] LJIIJ;
        int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
        if (this.LIZ.creativeModel.nowsShootModel == null && LJIIIZ != null) {
            LJIIIZ = C143205jg.LIZIZ(LJIIIZ);
        }
        o.LJIIIIZZ(this.LIZ.LJII(), "shortVideoContext.curShootingSegments");
        if (!(!r1.isEmpty()) || this.LIZ.LJIIIIZZ() <= 0 || str == null || ujb.o.LJJJJJL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z && (LJIIJ = C44739Hh9.LJIIJ(str)) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sticker render video size: draft: ");
            LIZ.append(Arrays.toString(LJIIJ));
            LIZ.append(", origin_size: ");
            LIZ.append(Arrays.toString(LJIIIZ));
            C79146V4k.LJJJJLL(X1D.LIZIZ(LIZ));
            vESize = new VESize(LJIIJ[0], LJIIJ[1]);
        } else {
            C44766Hha c44766Hha = InterfaceC44776Hhk.LJIIIZ;
            if (c44766Hha.videoSizeIndex() != c44766Hha.staticVideoSizeIndex()) {
                z2 = true;
            } else {
                z2 = false;
            }
            vESize = null;
            if (z2) {
                if (LJIIIZ != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("sticker render video size: byteBench: ");
                    LIZ2.append(Arrays.toString(LJIIIZ));
                    LIZ2.append(", origin_size: ");
                    LIZ2.append(Arrays.toString(LJIIIZ));
                    C79146V4k.LJJJJLL(X1D.LIZIZ(LIZ2));
                    vESize = new VESize(LJIIIZ[0], LJIIIZ[1]);
                }
            } else {
                if (LJIIIZ == null || LJIIIZ.length != 2) {
                    LIZIZ = "";
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LJIIIZ[0]);
                    LIZ3.append('x');
                    LIZ3.append(LJIIIZ[1]);
                    LIZIZ = X1D.LIZIZ(LIZ3);
                }
                StickerPreviewResolutionConfig LIZ4 = C44961Hkj.LIZ();
                if (LIZ4 != null && (list = LIZ4.resolution) != null && (LLILII = ORZ.LLILII(new Comparator() { // from class: X.2yg
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String a = (String) obj;
                        String b = (String) obj2;
                        if (a == null) {
                            if (b == null) {
                                return 0;
                            }
                            return -1;
                        }
                        if (b == null) {
                            return 1;
                        }
                        o.LJIIIIZZ(a, "a");
                        if (s.LJJJLZIJ(a, "x", false)) {
                            o.LJIIIIZZ(b, "b");
                            if (s.LJJJLZIJ(b, "x", false)) {
                                try {
                                    return CastIntegerProtector.parseInt((String) ListProtector.get(s.LJLJJL(a, new String[]{"x"}, 0, 6), 0)) - CastIntegerProtector.parseInt((String) ListProtector.get(s.LJLJJL(b, new String[]{"x"}, 0, 6), 0));
                                } catch (Throwable unused) {
                                    return a.compareTo(b);
                                }
                            }
                        }
                        o.LJIIIIZZ(b, "b");
                        return a.compareTo(b);
                    }
                }, list)) != null && !LLILII.isEmpty()) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("findDowngradeResolution sorted categoryList ");
                    LIZ5.append(Arrays.toString(LLILII.toArray(new String[0])));
                    C79146V4k.LJJJJLL(X1D.LIZIZ(LIZ5));
                    int indexOf = LLILII.indexOf(LIZIZ);
                    if (indexOf >= 0 || (indexOf = LLILII.size() - 1) >= 0) {
                        int i = 0;
                        while (true) {
                            int i2 = indexOf - i;
                            if (i2 < 0) {
                                break;
                            }
                            String str2 = (String) ListProtector.get(LLILII, i2);
                            if (!o.LJ(LIZIZ, str2)) {
                                LIZIZ = str2;
                                break;
                            }
                            i++;
                        }
                    }
                }
                int[] LJIIJ2 = C44739Hh9.LJIIJ(LIZIZ);
                if (LJIIJ2 != null) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("sticker render video size: downgrade_size: ");
                    LIZ6.append(Arrays.toString(LJIIJ2));
                    LIZ6.append(", origin_size: ");
                    LIZ6.append(Arrays.toString(LJIIIZ));
                    C79146V4k.LJJJJLL(X1D.LIZIZ(LIZ6));
                    vESize = new VESize(LJIIJ2[0], LJIIJ2[1]);
                }
            }
        }
        if (LIZ()) {
            int[] LIZJ = LIZJ();
            if (LIZJ.length == 2) {
                VESize vESize2 = new VESize(LIZJ[0], LIZJ[1]);
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("full Screen, sticker render video size: (");
                LIZ7.append(vESize2.width);
                LIZ7.append(", ");
                LIZ7.append(vESize2.height);
                LIZ7.append(')');
                C79146V4k.LJJJJLL(X1D.LIZIZ(LIZ7));
                return vESize2;
            }
            return vESize;
        }
        return vESize;
    }
}
