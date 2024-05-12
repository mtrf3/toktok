package X;

import Y.ACallableS19S0100100_7;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GPx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41485GPx {
    public final VideoPublishEditModel LIZ;
    public final C41005G7l LIZIZ;
    public final GB1<AVTextExtraStruct> LIZJ;
    public final GS5 LIZLLL;
    public final String LJ;
    public final GQD LJFF;
    public final GQI LJI;
    public final GQ4 LJII;

    public final List<AVChallenge> LIZ() {
        ArrayList arrayList = new ArrayList();
        String str = this.LIZ.creativeModel.duetModel.duetHashtag;
        if ((str == null || str.length() == 0) && (str = this.LIZ.getDuetHashTag()) == null) {
            str = "";
        }
        if (str.length() > 0 && e1.LIZ(31744, "studio_duet_bind_hashtag", true, false)) {
            AVChallenge aVChallenge = new AVChallenge();
            aVChallenge.challengeName = str;
            arrayList.add(aVChallenge);
        }
        return arrayList;
    }

    public final void LJFF() {
        GQI gqi = this.LJI;
        GB1<AVTextExtraStruct> lexicalEditor = this.LIZJ;
        gqi.getClass();
        o.LJIIIZ(lexicalEditor, "lexicalEditor");
        List<AbstractC41507GQt<AVTextExtraStruct>> list = lexicalEditor.LJ;
        InterfaceC41097GAz<AVTextExtraStruct> interfaceC41097GAz = lexicalEditor.LIZ;
        GQH gqh = new GQH(gqi, lexicalEditor);
        SpannableStringBuilder renderObject = SpannableStringBuilder.valueOf("");
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            AbstractC41507GQt abstractC41507GQt = (AbstractC41507GQt) it.next();
            renderObject.append((CharSequence) gqh.LIZ(abstractC41507GQt).LIZ(gqh, abstractC41507GQt));
        }
        C40964G5w LJ = interfaceC41097GAz.LJ();
        o.LJIIIIZZ(renderObject, "renderObject");
        LJ.LIZ.setText(renderObject);
    }

    public final void LJIIIZ() {
        InterfaceC41097GAz<AVTextExtraStruct> interfaceC41097GAz = this.LIZJ.LIZ;
        if (interfaceC41097GAz.LIZ().LIZ.LJLLI) {
            if (interfaceC41097GAz.LIZ().LIZ.LLF) {
                interfaceC41097GAz.LIZ().LIZ.setShouldDisableTrim(false);
            } else {
                interfaceC41097GAz.LIZ().LIZ.setHasUrlTransforming(false);
                C40964G5w LJ = interfaceC41097GAz.LJ();
                int urlStart = interfaceC41097GAz.LIZ().LIZ.getUrlStart();
                int urlEnd = interfaceC41097GAz.LIZ().LIZ.getUrlEnd();
                Editable text = LJ.LIZ.getText();
                if (text != null) {
                    text.delete(urlStart, urlEnd);
                }
                C41486GPy LIZ = interfaceC41097GAz.LIZ();
                LIZ.LIZ.setUrlEnd(interfaceC41097GAz.LIZ().LIZ.getUrlStart());
                interfaceC41097GAz.LIZ().LIZ.setTransformingUrlRemoved(true);
            }
        }
        GSR gsr = interfaceC41097GAz.LJ().LIZ;
        gsr.getClass();
        C78866UxK.LJL(gsr);
    }

    public static String LIZIZ(List list) {
        Object next;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it.next();
                if (C78685UuP.LJJJZ(aVTextExtraStruct.hashTagName)) {
                    String str = aVTextExtraStruct.hashTagName;
                    if (str != null) {
                        if (arrayList.contains(str)) {
                            continue;
                        } else {
                            String str2 = aVTextExtraStruct.hashTagName;
                            if (str2 != null) {
                                arrayList.add(str2);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                while (it2.hasNext()) {
                    next = C00F.LIZIZ((String) next, ',', (String) it2.next());
                }
            }
            String str3 = (String) next;
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public static String LIZJ(List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it.next();
            if (C78685UuP.LJJJZ(aVTextExtraStruct.hashTagName)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('#');
                LIZ.append(aVTextExtraStruct.hashTagName);
                LIZ.append(' ');
                sb.append(X1D.LIZIZ(LIZ));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public static void LJ(String str) {
        I9A.LIZJ("CaptionComponent", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41485GPx.LJI(java.lang.String):void");
    }

    public final void LJII(VideoPublishEditModel model) {
        String str;
        o.LJIIIZ(model, "model");
        long currentTimeMillis = System.currentTimeMillis();
        LJIIIZ();
        EditText editText = this.LIZLLL.LJIIJJI;
        if (editText != null) {
            C78866UxK.LJL(editText);
        }
        CharSequence LIZ = this.LIZJ.LIZ.LJ().LIZ();
        if (LIZ != null) {
            str = LIZ.toString();
        } else {
            str = null;
        }
        model.setTitle(str);
        GS5 gs5 = this.LIZLLL;
        if (gs5.LJI) {
            model.heading = gs5.LIZ();
        }
        model.setStructList(GQ6.LIZ(this.LIZJ.LIZ.LIZ(), this.LJ));
        if (C40976G6i.LIZ() || model.creativeModel.editPostModel != null) {
            LJIIIIZZ(model);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (((Boolean) C42552Gmy.LIZ.getValue()).booleanValue()) {
            C10K.LIZJ(new ACallableS19S0100100_7(currentTimeMillis2, this, 4));
            return;
        }
        GQ4 gq4 = this.LJII;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        gq4.getClass();
        GQ4.LIZIZ(videoPublishEditModel, "publish", currentTimeMillis2);
    }

    public final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("studio_mock_illegal_video_description", false)) {
                C60903NvH.LJIIJJI().LJJIIJ();
            }
            C0UE LIZ = this.LIZJ.LIZ();
            String LIZLLL = LIZ.LIZLLL();
            List<AVTextExtraStruct> LIZJ = LIZ.LIZJ();
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            PostPageModel postPageModel = creativeModel.postPageModel;
            postPageModel.markupCaption = LIZLLL;
            postPageModel.markupExtra = LIZJ;
            CommonMobParamModel commonMobParamModel = creativeModel.commonMobModel;
            String LIZIZ = LIZIZ(LIZJ);
            commonMobParamModel.getClass();
            commonMobParamModel.hashtagList = LIZIZ;
            CommonMobParamModel commonMobParamModel2 = creativeModel.commonMobModel;
            String LIZJ2 = LIZJ(creativeModel.postPageModel.markupExtra);
            commonMobParamModel2.getClass();
            commonMobParamModel2.pureHashtagString = LIZJ2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("markup text: ");
            LIZ2.append(videoPublishEditModel.creativeModel.postPageModel.markupCaption);
            LJ(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("markup metadata(size=");
            LIZ3.append(videoPublishEditModel.creativeModel.postPageModel.markupExtra.size());
            LIZ3.append("): ");
            LIZ3.append(C2309394n.LIZ(videoPublishEditModel.creativeModel.postPageModel.markupExtra));
            LJ(X1D.LIZIZ(LIZ3));
            if (C40982G6o.LIZ()) {
                CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
                captionModel.markupText = LIZLLL;
                captionModel.markupExtra = LIZJ;
            } else {
                CaptionModel captionModel2 = videoPublishEditModel.creativeModel.postPageModel.captionModel;
                captionModel2.markupText = null;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                o.LJIIIZ(c61878OQg, "<set-?>");
                captionModel2.markupExtra = c61878OQg;
            }
        } catch (Exception e) {
            LJ("snapshot caption state for publish failed");
            CharSequence LIZ4 = this.LIZJ.LIZ.LJ().LIZ();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("displayText: ");
            LIZ5.append((Object) LIZ4);
            LJ(X1D.LIZIZ(LIZ5));
            String LIZ6 = C2309394n.LIZ(GQ6.LIZ(this.LIZJ.LIZ.LIZ(), C60903NvH.LJIIJJI().getAccountService().getCurrentUserID()));
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("metadata: ");
            LIZ7.append(LIZ6);
            LJ(X1D.LIZIZ(LIZ7));
            OSZ[] oszArr = new OSZ[8];
            oszArr[0] = new OSZ("contentType", H7R.LJIIIZ(this.LIZ));
            oszArr[1] = new OSZ(WM7.SCENE_SERVICE, "snapshotCaptionStateWithNewProtocol");
            String title = this.LIZ.getTitle();
            String str2 = "";
            if (title == null) {
                title = "";
            }
            oszArr[2] = new OSZ("title", title);
            List<AVTextExtraStruct> structList = this.LIZ.getStructList();
            if (structList == null || (str = structList.toString()) == null) {
                str = "";
            }
            oszArr[3] = new OSZ("extra", str);
            String str3 = this.LIZ.creativeModel.postPageModel.captionModel.markupText;
            if (str3 != null) {
                str2 = str3;
            }
            oszArr[4] = new OSZ("markupText", str2);
            oszArr[5] = new OSZ("markupExtra", this.LIZ.creativeModel.postPageModel.captionModel.markupExtra.toString());
            oszArr[6] = new OSZ("displayText", String.valueOf(LIZ4));
            oszArr[7] = new OSZ("displayMetadata", LIZ6);
            LIZLLL(e, C113554cx.LJJL(oszArr));
        }
    }

    public static void LIZLLL(Exception exc, java.util.Map map) {
        if (!e1.LIZ(31744, "studio_illegal_video_desc_handling_strategy", true, false)) {
            C60903NvH.LJIIJJI().getPublishService().LJIJJLI().LIZ(exc, map);
        } else {
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZIZ(map);
            throw exc;
        }
    }

    public C41485GPx(ActivityC45651qj activityC45651qj, VideoPublishEditModel editModel, C41005G7l c41005G7l, GB1<AVTextExtraStruct> gb1, GS5 imageHeaderModule) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(imageHeaderModule, "imageHeaderModule");
        this.LIZ = editModel;
        this.LIZIZ = c41005G7l;
        this.LIZJ = gb1;
        this.LIZLLL = imageHeaderModule;
        this.LJ = C77339UWx.LIZJ();
        this.LJFF = new GQD(activityC45651qj, editModel, gb1);
        this.LJI = new GQI(activityC45651qj);
        this.LJII = new GQ4();
    }
}
