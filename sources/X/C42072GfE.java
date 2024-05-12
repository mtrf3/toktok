package X;

import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.publish.core.createaweme.CreateAwemeApi$API;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.GfE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42072GfE extends AbstractC43455H3r {
    public C43403H1r LJFF;
    public C43404H1s LJI;
    public VideoCreation LJII;
    public SynthetiseResult LJIIIIZZ;
    public C67996QmO LJIIIZ;
    public C41594GUc LJIIJ;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.CREATE_AWEME;
    }

    public final CreateBaseAwemeResponse LJIIJJI(LinkedHashMap<String, String> linkedHashMap) {
        C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
        C41777GaT.LIZ();
        LJII().LIZIZ();
        CreateAwemeResponse createAwemeResponse = ((CreateAwemeApi$API) V0N.LJIILIIL(CreateAwemeApi$API.class)).createAweme(linkedHashMap).execute().LIZIZ;
        o.LJIIIIZZ(createAwemeResponse, "externalDependency.getNe…(fields).execute().body()");
        return createAwemeResponse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0497, code lost:
    
        if (r2 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x049a, code lost:
    
        if (r1 != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x062b, code lost:
    
        r1 = ((com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r9.LIZ).creativeModel.postPageModel.markupExtra;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04ac, code lost:
    
        if (r2.length() <= 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04ae, code lost:
    
        r8.put("markup_text", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04b9, code lost:
    
        if ((!r1.isEmpty()) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04bb, code lost:
    
        r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(X.C60903NvH.LJIIJJI().LIZ(), r1);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "getAPI().getGson().toJson(markupMetadata)");
        r8.put("text_extra", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x049c, code lost:
    
        r1 = ((com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r9.LIZ).creativeModel.postPageModel.captionModel.markupExtra;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0627, code lost:
    
        if (r2 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0166, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0168, code lost:
    
        if (r11 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x016a, code lost:
    
        r12 = r11.uri;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x016c, code lost:
    
        if (r12 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x016e, code lost:
    
        if (r11 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0170, code lost:
    
        r4.add(new com.ss.android.ugc.aweme.shortvideo.model.ImagePostData(r12, r11.height, r11.width));
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0999, code lost:
    
        "Required value was null.".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x09a1, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x09a2, code lost:
    
        "Required value was null.".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x09aa, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0372, code lost:
    
        if (r12 == null) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0869 A[LOOP:2: B:212:0x0863->B:214:0x0869, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0970 A[Catch: Exception -> 0x098f, TRY_LEAVE, TryCatch #0 {Exception -> 0x098f, blocks: (B:240:0x096c, B:242:0x0970, B:244:0x097c, B:245:0x0985, B:248:0x0981, B:249:0x0989, B:250:0x098e), top: B:239:0x096c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0989 A[Catch: Exception -> 0x098f, TryCatch #0 {Exception -> 0x098f, blocks: (B:240:0x096c, B:242:0x0970, B:244:0x097c, B:245:0x0985, B:248:0x0981, B:249:0x0989, B:250:0x098e), top: B:239:0x096c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0967 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0882  */
    /* JADX WARN: Type inference failed for: r1v85, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.ERR r30) {
        /*
            Method dump skipped, instructions count: 2547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42072GfE.LJIIL(X.ERR):void");
    }

    public final void LJIILIIL(C41819Gb9 c41819Gb9) {
        int i;
        if (c41819Gb9.getCause() instanceof C41601GUj) {
            i = 100104;
        } else {
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    i = C42991Gu3.LJI(5555, c41819Gb9.getCause());
                }
            } catch (Exception unused) {
            }
            i = -2;
        }
        C67996QmO c67996QmO = this.LJIIIZ;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(i, c41819Gb9);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    public final void LJIILJJIL(CreateBaseAwemeResponse createBaseAwemeResponse) {
        String str;
        CreateAwemeResponse createAwemeResponse;
        Aweme aweme;
        C67996QmO c67996QmO = this.LJIIIZ;
        if (c67996QmO != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create aweme success, logid: ");
            LIZ.append(createBaseAwemeResponse.extra.logid);
            LIZ.append(", video id(video arch): ");
            VideoCreation videoCreation = this.LJII;
            if (videoCreation != null) {
                LIZ.append(videoCreation.getMaterialId());
                LIZ.append(", aweme id(creation platform): ");
                if ((createBaseAwemeResponse instanceof CreateAwemeResponse) && (createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse) != null && (aweme = createAwemeResponse.aweme) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                LIZ.append(str);
                c67996QmO.LIZIZ(new C43393H1h("CreateAwemeTask", X1D.LIZIZ(LIZ)), EnumC43531H6p.OUTER);
                VideoCreation videoCreation2 = this.LJII;
                if (videoCreation2 != null) {
                    createBaseAwemeResponse.materialId = videoCreation2.getMaterialId();
                    C67996QmO c67996QmO2 = this.LJIIIZ;
                    if (c67996QmO2 != null) {
                        c67996QmO2.LJ(createBaseAwemeResponse, false);
                        return;
                    } else {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                }
                o.LJIJI("videoCreation");
                throw null;
            }
            o.LJIJI("videoCreation");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        String str;
        float f;
        Object next;
        o.LJIIIZ(args, "args");
        C42074GfG.LIZ();
        this.LJIIIZ = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            if (next2 instanceof C43335Gzb) {
                if (next2 != null) {
                    this.LJII = ((C43335Gzb) next2).LJLIL;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next3 = it2.next();
                        if (next3 instanceof C43403H1r) {
                            if (next3 != null) {
                                this.LJFF = (C43403H1r) next3;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it3.next();
                                    if (next4 instanceof SynthetiseResult) {
                                        if (next4 != null) {
                                            this.LJIIIIZZ = (SynthetiseResult) next4;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next5 = it4.next();
                                                if (next5 instanceof ERL) {
                                                    if (next5 != null) {
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next6 = it5.next();
                                                            if (next6 instanceof C43397H1l) {
                                                                if (next6 != null) {
                                                                    Iterator<Object> it6 = args.LIZ.iterator();
                                                                    while (true) {
                                                                        if (!it6.hasNext()) {
                                                                            break;
                                                                        }
                                                                        Object next7 = it6.next();
                                                                        if (next7 instanceof C41594GUc) {
                                                                            if (next7 != null) {
                                                                                this.LJIIJ = (C41594GUc) next7;
                                                                                Iterator<Object> it7 = args.LIZ.iterator();
                                                                                while (true) {
                                                                                    if (!it7.hasNext()) {
                                                                                        break;
                                                                                    }
                                                                                    Object next8 = it7.next();
                                                                                    if (next8 instanceof C43404H1s) {
                                                                                        if (next8 != null) {
                                                                                            this.LJI = (C43404H1s) next8;
                                                                                            Iterator<Object> it8 = args.LIZ.iterator();
                                                                                            while (true) {
                                                                                                if (it8.hasNext()) {
                                                                                                    obj = it8.next();
                                                                                                    if (obj instanceof C41785Gab) {
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    obj = null;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!(obj instanceof C41785Gab)) {
                                                                                                obj = null;
                                                                                            }
                                                                                            C41785Gab c41785Gab = (C41785Gab) obj;
                                                                                            C43403H1r c43403H1r = this.LJFF;
                                                                                            if (c43403H1r != null) {
                                                                                                if (H7R.LJJJJL(c43403H1r.LIZ) && c41785Gab != null && c41785Gab.LJLIL.length() > 0) {
                                                                                                    C43403H1r c43403H1r2 = this.LJFF;
                                                                                                    if (c43403H1r2 != null) {
                                                                                                        int[] LIZJ = C42299Git.LIZJ(C44729Hgz.LJIJI(c43403H1r2.LIZ));
                                                                                                        VideoCreation videoCreation = this.LJII;
                                                                                                        if (videoCreation != null) {
                                                                                                            C43403H1r c43403H1r3 = this.LJFF;
                                                                                                            if (c43403H1r3 != null) {
                                                                                                                String videoCoverPath = c43403H1r3.LIZ.getVideoCoverPath();
                                                                                                                if (videoCoverPath != null) {
                                                                                                                    videoCreation.setImageCoverModel(new PublishImageModel(videoCoverPath, LIZJ[0], LIZJ[1], c41785Gab.LJLIL));
                                                                                                                } else {
                                                                                                                    "Required value was null.".toString();
                                                                                                                    throw new IllegalArgumentException("Required value was null.");
                                                                                                                }
                                                                                                            } else {
                                                                                                                o.LJIJI("editModelContainer");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            o.LJIJI("videoCreation");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        o.LJIJI("editModelContainer");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    VideoCreation videoCreation2 = this.LJII;
                                                                                                    if (videoCreation2 != null) {
                                                                                                        if (c41785Gab != null) {
                                                                                                            str = c41785Gab.LJLIL;
                                                                                                        } else {
                                                                                                            str = null;
                                                                                                        }
                                                                                                        videoCreation2.setCoverTextImageUri(str);
                                                                                                    } else {
                                                                                                        o.LJIJI("videoCreation");
                                                                                                        throw null;
                                                                                                    }
                                                                                                }
                                                                                                C43403H1r c43403H1r4 = this.LJFF;
                                                                                                if (c43403H1r4 != null) {
                                                                                                    if (!H7R.LJJJJL(c43403H1r4.LIZ)) {
                                                                                                        Iterator<Object> it9 = args.LIZ.iterator();
                                                                                                        while (it9.hasNext() && (next = it9.next()) != null && !(next instanceof XFL)) {
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        VecString vecString = C42073GfF.LIZ;
                                                                                                        if (vecString != null) {
                                                                                                            Iterator<String> it10 = vecString.iterator();
                                                                                                            while (it10.hasNext()) {
                                                                                                                String next9 = it10.next();
                                                                                                                if (next9 != null && next9.length() > 0) {
                                                                                                                    JSONArray jSONArray = new JSONArray(next9);
                                                                                                                    int length = jSONArray.length();
                                                                                                                    for (int i = 0; i < length; i++) {
                                                                                                                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                                                                                                                        o.LJIIIIZZ(jSONObject, "resArray.getJSONObject(i)");
                                                                                                                        java.util.Map<String, Object> map = JsonExtKt.toMap(jSONObject);
                                                                                                                        C145995oB c145995oB = new C145995oB();
                                                                                                                        String str2 = C42073GfF.LIZIZ;
                                                                                                                        String str3 = "";
                                                                                                                        if (str2 == null) {
                                                                                                                            str2 = "";
                                                                                                                        }
                                                                                                                        c145995oB.LJI("creation_id", str2);
                                                                                                                        String str4 = C42073GfF.LIZJ;
                                                                                                                        if (str4 == null) {
                                                                                                                            str4 = "";
                                                                                                                        }
                                                                                                                        c145995oB.LJI("device_id", str4);
                                                                                                                        String str5 = C42073GfF.LIZLLL;
                                                                                                                        if (str5 == null) {
                                                                                                                            str5 = "";
                                                                                                                        }
                                                                                                                        c145995oB.LJI("item_id", str5);
                                                                                                                        String str6 = C42073GfF.LJ;
                                                                                                                        if (str6 == null) {
                                                                                                                            str6 = "";
                                                                                                                        }
                                                                                                                        c145995oB.LJI("user_id", str6);
                                                                                                                        String str7 = C42073GfF.LJFF;
                                                                                                                        if (str7 != null) {
                                                                                                                            str3 = str7;
                                                                                                                        }
                                                                                                                        c145995oB.LJI("music_id", str3);
                                                                                                                        Float f2 = C42073GfF.LJI;
                                                                                                                        if (f2 != null) {
                                                                                                                            f = f2.floatValue();
                                                                                                                        } else {
                                                                                                                            f = 0.0f;
                                                                                                                        }
                                                                                                                        c145995oB.LIZJ(Float.valueOf(f), "duration");
                                                                                                                        for (String str8 : map.keySet()) {
                                                                                                                            c145995oB.LIZJ(map.get(str8), str8);
                                                                                                                        }
                                                                                                                        FMX.LJIIL("sami_snr", c145995oB.LIZ);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable unused) {
                                                                                                    }
                                                                                                    C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
                                                                                                    C41775GaR.LIZJ(H1T.CREATE_AWEME);
                                                                                                    LJIIL(args);
                                                                                                    return;
                                                                                                }
                                                                                                o.LJIJI("editModelContainer");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("editModelContainer");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.scheduler.PublishCancellableFlag");
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.UploadResult");
    }
}
