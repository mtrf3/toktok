package X;

import Y.ACListenerS25S0101000_7;
import Y.IDCListenerS10S0101000;
import Y.IDObjectS179S0100000_7;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.aweme.video.hashtag.helper.TitleHelper;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQ5 {
    public static final String LJIJJLI = C16880lQ.LJLLJ(GQ5.class);
    public final G6K LIZ;
    public final GSR LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final BaseTitleHelper LJI;
    public final HashTagMobHelper LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public G7K LJIIJ;
    public String LJIIJJI;
    public final VideoPublishEditModel LJIIL;
    public boolean LJIILIIL;
    public final ActivityC45651qj LJIILL;
    public GS5 LJIIZILJ;
    public GS5 LJIJ;
    public GQ8 LJIJI;
    public String LJFF = "";
    public int LJIILJJIL = -1;
    public C41005G7l LJIILLIIL = new C41005G7l();
    public final ArrayList<GAK> LJIJJ = new ArrayList<>();

    public static boolean LJII() {
        C78934UyQ.LJLIL.LIZLLL().getClass();
        return AnonymousClass842.LIZ();
    }

    public final List<AVTextExtraStruct> LJ() {
        GSR gsr = this.LIZIZ;
        String str = this.LJIIJJI;
        Editable text = gsr.getText();
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        C41549GSj[] c41549GSjArr = (C41549GSj[]) text.getSpans(0, text.length(), C41549GSj.class);
        int length = c41549GSjArr.length;
        int[] iArr = new int[length];
        if (c41549GSjArr.length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = text.getSpanStart(c41549GSjArr[i]);
            }
            Arrays.sort(iArr);
        }
        ArrayList arrayList = new ArrayList();
        for (MentionSpan mentionSpan : gsr.getMentionText()) {
            int i2 = mentionSpan.mType;
            if (i2 == 0 || i2 == 5) {
                int spanStart = text.getSpanStart(mentionSpan);
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (spanStart > iArr[i4]) {
                        i3++;
                    }
                }
                mentionSpan.mStruct.setStart(text.getSpanStart(mentionSpan) - i3);
                mentionSpan.mStruct.setEnd(text.getSpanEnd(mentionSpan) - i3);
                arrayList.add(mentionSpan.mStruct);
            }
        }
        Iterator it = ((ArrayList) gsr.LJIJ(gsr.getNoAdTagText())).iterator();
        while (it.hasNext()) {
            C41529GRp c41529GRp = (C41529GRp) it.next();
            int i5 = c41529GRp.LIZ;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (i5 > iArr[i7]) {
                    i6++;
                }
            }
            MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(c41529GRp.LIZ, c41529GRp.LIZIZ, MentionSpan.class);
            if (mentionSpanArr != null) {
                boolean z = false;
                for (MentionSpan mentionSpan2 : mentionSpanArr) {
                    TextExtraStruct textExtraStruct = mentionSpan2.mStruct;
                    if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                        z = true;
                    }
                }
                if (z) {
                }
            }
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(1);
            textExtraStruct2.setHashTagName(c41529GRp.LIZJ.replaceAll("#", ""));
            textExtraStruct2.setStart(c41529GRp.LIZ - i6);
            textExtraStruct2.setEnd(c41529GRp.LIZIZ - i6);
            arrayList.add(textExtraStruct2);
            GSR.LJJII(str, textExtraStruct2.getHashTagName());
        }
        return C65661Ppp.LIZ(C65661Ppp.LIZLLL(arrayList, new GRR()));
    }

    public final void LJIIIIZZ() {
        GQ8 gq8 = this.LJIJI;
        if (gq8 == null || ((ArrayList) gq8.LIZ).isEmpty() || !gq8.LIZLLL) {
            return;
        }
        String json = GsonProtectorUtils.toJson(gq8.LIZJ, gq8.LIZ);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "publish");
        c145995oB.LJI("input_content", gq8.LIZIZ);
        c145995oB.LJI("input_content_cut", json);
        FMX.LJIIL("input_word_cut", c145995oB.LIZ);
        gq8.LIZLLL = false;
        gq8.LIZIZ = null;
        ((ArrayList) gq8.LIZ).clear();
    }

    public final void LJIILIIL() {
        GSR gsr = this.LIZIZ;
        if (gsr.LJLLI) {
            if (gsr.LLF) {
                gsr.setShouldDisableTrim(false);
            } else {
                gsr.setHasUrlTransforming(false);
                if (this.LIZIZ.getText() != null) {
                    this.LIZIZ.getText().delete(this.LIZIZ.getUrlStart(), this.LIZIZ.getUrlEnd());
                }
                GSR gsr2 = this.LIZIZ;
                gsr2.setUrlEnd(gsr2.getUrlStart());
                this.LIZIZ.setTransformingUrlRemoved(true);
            }
        }
        GSR gsr3 = this.LIZIZ;
        gsr3.getClass();
        C78866UxK.LJL(gsr3);
    }

    public final void LJIILJJIL() {
        int LIZIZ = this.LJIILLIIL.LIZIZ() + C40949G5h.LIZ;
        if (LIZLLL() > LIZIZ) {
            GSR gsr = this.LIZIZ;
            if (!gsr.LJLLI) {
                String substring = gsr.getNoAdTagText().substring(0, LIZIZ);
                GSR gsr2 = this.LIZIZ;
                gsr2.getClass();
                int curAdTagStart = this.LIZIZ.getCurAdTagStart();
                Editable text = gsr2.getText();
                if (text != null) {
                    text.replace(0, curAdTagStart, substring);
                }
            }
        }
    }

    public final int LIZLLL() {
        if (LJII()) {
            return this.LIZIZ.getNoAdTagText().replace("\n", "").length();
        }
        return this.LIZIZ.getNoAdTagText().length();
    }

    public final void LIZ(List<AVChallenge> list) {
        String obj;
        C41529GRp c41529GRp;
        if (this.LIZIZ.getText() == null || (obj = this.LIZIZ.getText().toString()) == null) {
            return;
        }
        ArrayList LJII = C73030SlO.LJII(obj);
        int length = obj.length();
        if (!C79004UzY.LJJIFFI(list)) {
            for (AVChallenge aVChallenge : list) {
                if (aVChallenge != null) {
                    java.util.Set<String> set = this.LIZIZ.LLFZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("#");
                    LIZ.append(aVChallenge.challengeName);
                    ((HashSet) set).add(X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("#");
                    LIZ2.append(aVChallenge.getChallengeName());
                    if (!LJII.contains(X1D.LIZIZ(LIZ2))) {
                        String challengeName = aVChallenge.getChallengeName();
                        if (challengeName == null) {
                            c41529GRp = new C41529GRp("", 0, 0);
                        } else {
                            c41529GRp = new C41529GRp();
                            String LJ = a1.LJ("#", challengeName, " ");
                            c41529GRp.LIZ = length;
                            c41529GRp.LIZJ = LJ;
                            c41529GRp.LIZIZ = LJ.length() + length;
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("#");
                        LIZ3.append(aVChallenge.getChallengeName());
                        LJII.add(X1D.LIZIZ(LIZ3));
                        if (c41529GRp.LIZIZ <= this.LJIILLIIL.LIZIZ() + C40949G5h.LIZ) {
                            GSR gsr = this.LIZIZ;
                            gsr.LLJI = false;
                            gsr.getText().insert(c41529GRp.LIZ, c41529GRp.LIZJ);
                            length = c41529GRp.LIZIZ;
                        }
                        this.LIZIZ.LJIJJ(true);
                    }
                }
            }
        }
    }

    public final boolean LIZIZ(boolean z) {
        int length;
        int LIZIZ = this.LJIILLIIL.LIZIZ() + C40949G5h.LIZ;
        if (TextUtils.isEmpty(this.LIZIZ.getAdTag()) && this.LIZIZ.getText() != null) {
            if (LJII()) {
                length = this.LIZIZ.getText().toString().replace("\n", "").length();
            } else {
                length = this.LIZIZ.getText().length();
            }
        } else if (LJII()) {
            length = this.LIZIZ.getNoAdTagText().replace("\n", "").length();
        } else {
            length = this.LIZIZ.getNoAdTagText().length();
        }
        int i = LIZIZ - length;
        if (i < 0 || (i == 0 && z)) {
            String LIZ = C41050G9e.LIZ(LIZIZ);
            C164236cV.LIZJ(this.LJIIL);
            GSR gsr = this.LIZIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(LIZ);
            C78915Uy7.LJJIJ(gsr, 2016, creativeToastBuilder);
            return true;
        }
        return false;
    }

    public final void LIZJ(String str) {
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", this.LJFF);
        c188727au.LJIIIZ("enter_from", "video_post_page");
        c188727au.LJIIIZ("enter_method", str);
        VideoPublishEditModel videoPublishEditModel = this.LJIIL;
        if (videoPublishEditModel == null) {
            str2 = "";
        } else {
            str2 = videoPublishEditModel.mShootWay;
        }
        c188727au.LJIIIZ("shoot_way", str2);
        c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(this.LJIIL));
        c188727au.LJIIIZ("content_type", H7R.LJIIIZ(this.LJIIL));
        FMX.LJIIL("click_caption_return", c188727au.LIZ);
    }

    public final void LJI(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        GSR gsr;
        String chain = videoPublishEditModel.getChain();
        C60903NvH.LJIIJJI().getPublishService().LJIIJ();
        if (G8X.LIZ(videoPublishEditModel)) {
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            chain = captionModel.chain;
            z = captionModel.disableDeleteChain;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(chain)) {
            this.LJIIIIZZ = chain;
            this.LJIIIZ = z;
        }
        this.LIZIZ.setEmoticonFilter(0);
        this.LIZIZ.addTextChangedListener(new GQ7(this));
        String creationId = videoPublishEditModel.getCreationId();
        this.LJFF = creationId;
        GSR gsr2 = this.LIZIZ;
        if (gsr2 != null) {
            gsr2.setCreationId(creationId);
        }
        if (videoPublishEditModel.isDuet()) {
            GSR gsr3 = this.LIZIZ;
            if (gsr3 != null) {
                gsr3.setVideoType(1);
            }
        } else if (videoPublishEditModel.isCommentReply() && (gsr = this.LIZIZ) != null) {
            gsr.setVideoType(3);
        }
        List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
        if (structList == null) {
            return;
        }
        for (AVTextExtraStruct aVTextExtraStruct : structList) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("#");
            LIZ.append(aVTextExtraStruct.hashTagName);
            String trim = X1D.LIZIZ(LIZ).trim();
            if (!C73030SlO.LJFF(trim)) {
                ((HashSet) this.LIZIZ.LLFZ).add(trim);
            }
        }
    }

    public final void LJIIIZ(Intent intent) {
        String LIZ;
        C44172HVg.LJ.getClass();
        User LJI = C1791071e.LIZIZ.LJI(intent);
        if (LJI != null) {
            GSR gsr = this.LIZIZ;
            if (FriendsServiceImpl.LJJJJ().LJIJJ() && LJI.getNickname() != null) {
                LIZ = LJI.getNickname();
            } else {
                LIZ = GT6.LIZ(LJI);
            }
            gsr.LJI(LIZ, LJI.getUid(), LJI.getSecUid());
        }
    }

    public final void LJIIJ(GAK gak) {
        ArrayList<GAK> arrayList = this.LJIJJ;
        gak.getClass();
        arrayList.add(gak);
    }

    public final void LJIIJJI(boolean z) {
        boolean z2;
        if (z) {
            if (!H7R.LJJLI(this.LJIIL) && GA4.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJIILLIIL = new C41002G7i(z2);
        } else {
            this.LJIILLIIL = new C41005G7l();
        }
        this.LIZIZ.setConfig(this.LJIILLIIL);
        GQ8 gq8 = new GQ8();
        this.LJIJI = gq8;
        GSR gsr = this.LIZIZ;
        if (gsr != null) {
            gsr.addTextChangedListener(new IDObjectS179S0100000_7(gq8, 4));
        }
        if (this.LIZJ != null) {
            if (C44172HVg.LJIJ.isChildrenMode() || SearchServiceImpl.LLLZI().LJLIL().disableHashtagSearch) {
                this.LIZJ.setVisibility(8);
            } else {
                this.LIZJ.setVisibility(0);
            }
        }
        GSR gsr2 = this.LIZIZ;
        gsr2.setMentionTextColor(C04330Ez.LIZIZ(gsr2.getContext(), R.color.ck));
        if (this.LIZJ != null && !C44172HVg.LJIJ.isChildrenMode()) {
            C16880lQ.LJIIJ(new IDCListenerS10S0101000(3, this, 2), this.LIZJ);
        }
        if (this.LIZLLL != null) {
            G8A g8a = G8A.LIZIZ;
            if (g8a.LIZJ(false)) {
                View view = this.LIZLLL;
                if (view instanceof TuxTextView) {
                    ((TextView) view).setText(this.LIZ.LJJLI(R.string.p6u));
                }
            } else if (g8a.LIZJ(true)) {
                this.LIZLLL.setVisibility(8);
            }
            C16880lQ.LJIIJ(new ACListenerS25S0101000_7(3, this, 4), this.LIZLLL);
        }
        View view2 = this.LJ;
        if (view2 != null) {
            C16880lQ.LJIIJ(new Au2S16S0100000_7(this, 2), view2);
        }
        if (this.LJIIIZ) {
            this.LIZIZ.setFixLengthInFront(this.LJIIIIZZ);
            this.LIZIZ.setChainString(this.LJIIIIZZ);
        }
        this.LIZIZ.setHashTagView(this.LIZJ);
        this.LIZIZ.setFragmentActivity(this.LJIILL);
        this.LIZIZ.setAccountTagView(this.LIZLLL);
    }

    public final void LJIIL(int i) {
        String LIZ = C41050G9e.LIZ(i);
        C164236cV.LIZJ(this.LJIIL);
        ActivityC45651qj LLII = this.LIZ.LLII();
        if (LLII != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(LIZ);
            C78915Uy7.LJJIIZI(LLII, 2017, creativeToastBuilder);
        }
    }

    public final G7K LJFF(int i, String str, boolean z) {
        G7K g7k = null;
        if (z || i == 2 || i == 1 || this.LIZIZ.getText() == null) {
            return null;
        }
        if (((Boolean) C42539Gml.LIZ.getValue()).booleanValue() && TextUtils.isEmpty(this.LIZIZ.getText()) && TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.LJIIJ == null) {
            if (C19N.LJ("allowed_post_prompts", false)) {
                g7k = new G7K();
            }
            this.LJIIJ = g7k;
        }
        return this.LJIIJ;
    }

    public GQ5(G6K g6k, GSR gsr, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3, VideoPublishEditModel videoPublishEditModel, WM7 scene) {
        this.LIZ = g6k;
        this.LIZIZ = gsr;
        this.LIZJ = tuxTextView;
        this.LIZLLL = tuxTextView2;
        this.LJ = tuxTextView3;
        this.LJIIL = videoPublishEditModel;
        this.LJIILL = g6k.LLII();
        o.LJIIIZ(scene, "scene");
        this.LJI = (BaseTitleHelper) C165706es.LJIIIIZZ(scene, null, null, 6).get(TitleHelper.class);
        this.LJII = (HashTagMobHelper) C165706es.LJIIIIZZ(scene, null, null, 6).get(HashTagMobHelper.class);
        if (videoPublishEditModel != null) {
            gsr.setVideoPublishEditModel(videoPublishEditModel);
        }
        C40949G5h.LIZ = 0;
    }
}
