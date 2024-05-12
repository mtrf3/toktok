package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ifc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47192Ifc implements InterfaceC39577Fg5 {
    public static java.util.Map LIZ(java.util.Map map) {
        SimVideoUrlModel LIZIZ;
        C47194Ife watchTimeInfo;
        IZK playTimeInfo;
        java.util.Map<String, String> groupPortraits;
        C47189IfZ c47189IfZ = C47190Ifa.LIZ;
        c47189IfZ.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = (HashMap) map;
        if (!hashMap2.isEmpty()) {
            String str = (String) hashMap2.get("from");
            String str2 = (String) hashMap2.get("type");
            String str3 = (String) hashMap2.get("name");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                if ("smart".equals(str) && c47189IfZ.LIZ != null) {
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        if ("one".equals(str2)) {
                            String portrait = c47189IfZ.LIZ.getPortrait(str3);
                            if (!TextUtils.isEmpty(portrait)) {
                                hashMap.put(str3, portrait);
                            }
                        } else if (str2.equals("group") && (groupPortraits = c47189IfZ.LIZ.getGroupPortraits(str3)) != null && !groupPortraits.isEmpty()) {
                            hashMap.putAll(groupPortraits);
                        }
                    }
                } else if ("video".equals(str)) {
                    String str4 = (String) hashMap2.get("video_id");
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && (LIZIZ = C46877IaX.LIZ.LIZIZ(str4)) != null) {
                            if ("one".equals(str2)) {
                                if ("play_time_prob_dist".equals(str3)) {
                                    IZG LIZ = C47189IfZ.LIZ(str4);
                                    if (LIZ != null && (playTimeInfo = LIZ.getPlayTimeInfo()) != null) {
                                        hashMap.put("gamma", playTimeInfo.getGamma());
                                        hashMap.put("beta", playTimeInfo.getBeta());
                                        hashMap.put("eta", playTimeInfo.getEta());
                                    }
                                } else if ("estimate_posterior_watch_time".equals(str3)) {
                                    IZG LIZ2 = C47189IfZ.LIZ(str4);
                                    if (LIZ2 != null && (watchTimeInfo = LIZ2.getWatchTimeInfo()) != null) {
                                        hashMap.put("paramA", watchTimeInfo.getParamA());
                                        hashMap.put("paramB", watchTimeInfo.getParamB());
                                        hashMap.put("paramC", watchTimeInfo.getParamC());
                                        hashMap.put("paramD", watchTimeInfo.getParamD());
                                        hashMap.put("threshold", String.valueOf(watchTimeInfo.getThreshold()));
                                    }
                                } else if ("video_business_value".equals(str3)) {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append(LIZIZ.getScCategory());
                                    LIZ3.append("");
                                    hashMap.put("businessValue", X1D.LIZIZ(LIZ3));
                                }
                            } else if ("group".equals(str2)) {
                                ((HashMap) c47189IfZ.LIZIZ).containsKey(str3);
                            }
                        }
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        return hashMap;
    }

    public static final AbstractC143185je LIZIZ(final VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (H7R.LJJJJI(model)) {
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("VideoSizeProvider", "Nows");
            return new C147195q7(model);
        }
        if (model.creationMode == 4) {
            return new AbstractC143185je(model) { // from class: X.5Wc
                public int LIZLLL;
                public int LJ;

                @Override // X.InterfaceC147355qN
                public final int LIZIZ() {
                    return LJFF(false);
                }

                @Override // X.InterfaceC147355qN
                public final int LJ() {
                    return LIZ(false);
                }

                @Override // X.InterfaceC147355qN
                public final int LIZLLL() {
                    if (this.LIZLLL == 0) {
                        LJII();
                    }
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC147355qN
                public final int LJI() {
                    if (this.LJ == 0) {
                        LJII();
                    }
                    return this.LJ;
                }

                public final void LJII() {
                    if (this.LIZLLL == 0 || this.LJ == 0) {
                        int LJIIIIZZ = C60996Nwm.LJIIIIZZ(C60903NvH.LJ);
                        int LJ = C60996Nwm.LJ(C60903NvH.LJ);
                        int LJFF = LJFF(false);
                        int LIZ = LIZ(false);
                        if (LJIIIIZZ / LJ > LJFF / LIZ) {
                            this.LJ = LJ;
                            this.LIZLLL = (LJ * LJFF) / LIZ;
                        } else {
                            this.LIZLLL = LJIIIIZZ;
                            this.LJ = (LJIIIIZZ * LIZ) / LJFF;
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(model);
                    o.LJIIIZ(model, "model");
                }
            };
        }
        if (model.isFastImport) {
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("VideoSizeProvider", "FastImport");
            return new C140945g2(model);
        }
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("VideoSizeProvider", "NotFastImport");
        return new C140955g3(model);
    }
}
