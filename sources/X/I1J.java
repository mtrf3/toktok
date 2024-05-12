package X;

import Y.AObjectS86S0100000_7;
import Y.AfS59S0100000_7;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.panel.model.CommentStickerPanelData;
import com.ss.android.ugc.aweme.panel.model.CommentStickerPanelResponse;
import com.ss.android.ugc.aweme.panel.model.InviteRecommendMixQuestionStickerPanelResponseModel;
import com.ss.android.ugc.aweme.panel.model.MixedQuestionCollection;
import com.ss.android.ugc.aweme.panel.model.QuestionCollection;
import com.ss.android.ugc.aweme.panel.model.QuestionStickerPanelResponseModel;
import com.ss.android.ugc.aweme.panel.net.CommentStickerPanelRequestApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class I1J extends AbstractC29891Fh<InterfaceC81454Vxy> implements InterfaceC135635Tz, InterfaceC81454Vxy {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final CommentVideoModel LJLJJI;
    public final C6IE LJLJJL;
    public final I1L LJLJJLL;
    public final C5H3 LJLJL;
    public final List<String> LJLJLJ;
    public final List<String> LJLJLLL;
    public final java.util.Map<String, String> LJLL;
    public final java.util.Map<String, String> LJLLI;
    public EnumC81464Vy8 LJLLILLLL;
    public boolean LJLLJ;
    public CommentVideoModel LJLLL;
    public boolean LJLLLL;
    public final MutableLiveData<Boolean> LJLLLLLL;
    public final LiveData<Boolean> LJLZ;
    public final MutableLiveData<Boolean> LJZ;
    public String LJZI;
    public final java.util.Map<EnumC81464Vy8, List<Object>> LJZL;
    public final I1K LL;
    public final C40871j1<Object> LLD;
    public final C40871j1<Object> LLF;
    public final C40871j1<Object> LLFF;
    public final C40871j1<Object> LLFFF;
    public final C40871j1<Object> LLFII;
    public final C40871j1<Object> LLFZ;
    public final C29901Fi<Boolean> LLI;
    public final C29901Fi<Boolean> LLIFFJFJJ;
    public final C29901Fi<C76800UCe> LLII;
    public final LiveEvent<C76800UCe> LLIIII;
    public final C29901Fi<CommentVideoModel> LLIIIILZ;
    public final LiveEvent<CommentVideoModel> LLIIIJ;
    public final C29901Fi<QaStruct> LLIIIL;
    public final LiveEvent<QaStruct> LLIIIZ;
    public final C29901Fi<C76800UCe> LLIIJI;
    public final LiveEvent<C76800UCe> LLIIJLIL;
    public final MutableLiveData<Boolean> LLIIL;
    public final List<InterfaceC65784Pro<C76800UCe>> LLIILII;
    public final MutableLiveData<Boolean> LLIILZL;
    public final InterfaceC29911Fj<Boolean> LLIIZ;
    public final MutableLiveData<Boolean> LLIL;
    public final InterfaceC29911Fj<Boolean> LLILII;
    public final MutableLiveData<Boolean> LLILIL;
    public final InterfaceC29911Fj<Boolean> LLILL;
    public final C73318Sq2 LLILLIZIL;
    public boolean LLILLJJLI;
    public final C5H3 LLILLL;
    public final C29901Fi<Boolean> LLILZ;

    public final void LJJLI() {
        this.LJLLL = null;
        this.LJLLLL = false;
    }

    public void LJJLIIIJILLIZJL(QaStruct selectedStickerModel) {
        o.LJIIIZ(selectedStickerModel, "selectedStickerModel");
    }

    public InterfaceC81454Vxy LJJLIIIJJIZ() {
        return this;
    }

    public void s2() {
    }

    private final C81556Vzc LJJLJ() {
        return (C81556Vzc) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC81454Vxy
    public CommentVideoModel KV() {
        CommentVideoModel commentVideoModel = this.LJLLL;
        if (commentVideoModel == null) {
            return new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        }
        return commentVideoModel;
    }

    @Override // X.InterfaceC81454Vxy
    public void Ka() {
        this.LLII.LJII(C76800UCe.LIZ);
    }

    public final C81449Vxt LJJLIIJ() {
        return (C81449Vxt) this.LJLJL.getValue();
    }

    public final boolean LJJLL() {
        return ((ArrayList) HJN.LIZIZ).isEmpty();
    }

    @Override // X.InterfaceC81454Vxy
    public void Lz() {
        this.LLIFFJFJJ.LJII(Boolean.TRUE);
    }

    @Override // X.InterfaceC81454Vxy
    public void PA() {
        I1K i1k = this.LL;
        String str = this.LJZI;
        if (str == null) {
            str = "";
        }
        i1k.LIZ(str, new AqS173S0100000_7(this, 365));
    }

    public void W9() {
        this.LLILZ.LJII(Boolean.TRUE);
        if (!C52529KjV.LIZ() && !this.LJLILLLLZI.isAdded(LJJLIIJ())) {
            this.LJLILLLLZI.add(LJJLJLI(), LJJLIIJ(), "CommentStickerPanelScene");
        }
        if (C52529KjV.LIZ()) {
            LJJLJ().LLJJIJI(this.LJLILLLLZI);
        }
        LJJLIIJ().LLJJIJI(true);
    }

    @Override // X.InterfaceC81454Vxy
    public boolean aO() {
        if (!((ArrayList) HJN.LIZIZ).isEmpty()) {
            return false;
        }
        I1K i1k = this.LL;
        if (!i1k.LIZJ.isEmpty() || !i1k.LIZLLL.isEmpty()) {
            return false;
        }
        return true;
    }

    public void ah() {
        this.LLIIJI.LJII(C76800UCe.LIZ);
    }

    public void hidePanel() {
        Iterator<List<Object>> it = this.LJZL.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.LLILZ.LJII(Boolean.FALSE);
        if (C52529KjV.LIZ()) {
            LJJLJ().LLJJ(true);
        }
        LJJLIIJ().LLJJIJI(false);
        this.LJLJJLL.LIZJ(System.currentTimeMillis() / 1000, "dismiss");
    }

    @Override // X.InterfaceC81454Vxy
    public boolean mg0() {
        if (((ArrayList) HJN.LIZJ).isEmpty() && this.LL.LJ.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        HJN.LJ.LJFF(this.LLIIZ);
        this.LL.LJIIIIZZ.LJFF(this.LLILII);
        this.LL.LJII.LJFF(this.LLILL);
        this.LLILLIZIL.dispose();
        super.onDestroy();
    }

    @Override // X.InterfaceC81454Vxy
    public void tU() {
        java.util.Map<String, String> map;
        String str;
        I1L i1l = this.LJLJJLL;
        i1l.getClass();
        C145995oB LIZ = i1l.LIZ();
        if (LIZ != null) {
            if (I1U.LIZ() != 0) {
                str = "qna";
            } else {
                str = "reply";
            }
            LIZ.LIZLLL("design", str);
            map = LIZ.LIZ;
        } else {
            map = null;
        }
        GXR.LIZ("reply_panel_entrance_show", map);
    }

    @Override // X.InterfaceC81454Vxy
    public void ud0() {
        this.LJLJJLL.LJII = System.currentTimeMillis() / 1000;
    }

    @Override // X.InterfaceC81454Vxy
    public void yK() {
        java.util.Map<String, String> map;
        I1L i1l = this.LJLJJLL;
        i1l.getClass();
        C145995oB LIZ = i1l.LIZ();
        if (LIZ != null) {
            map = LIZ.LIZ;
        } else {
            map = null;
        }
        GXR.LIZ("click_reply_entrance", map);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        HJN.LJ.LIZLLL(this, this.LLIIZ);
        this.LL.LJIIIIZZ.LIZLLL(this, this.LLILII);
        this.LL.LJII.LIZLLL(this, this.LLILL);
    }

    @Override // X.InterfaceC81454Vxy
    public LiveData<Boolean> B90() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC81454Vxy
    public EnumC81464Vy8 L10() {
        return this.LJLLILLLL;
    }

    public int LJJLJLI() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC81454Vxy
    public LiveEvent<Boolean> LLJLILLLLZIIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC81454Vxy
    public LiveEvent<C76800UCe> Pj0() {
        return this.LLIIJLIL;
    }

    @Override // X.InterfaceC81454Vxy
    public C40871j1<Object> Q50() {
        return this.LLFF;
    }

    @Override // X.InterfaceC81454Vxy
    public List<String> TW() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC81454Vxy
    public /* bridge */ /* synthetic */ LiveEvent U50() {
        return this.LLIFFJFJJ;
    }

    @Override // X.InterfaceC81454Vxy
    public C40871j1<Object> Vx() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC81454Vxy
    public List<String> XD() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC81454Vxy
    public C40871j1<Object> XL() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC81454Vxy
    public MutableLiveData<Boolean> ab() {
        return this.LJZ;
    }

    @Override // X.InterfaceC81454Vxy
    public LiveEvent<C76800UCe> at0() {
        return this.LLIIII;
    }

    @Override // X.InterfaceC81454Vxy
    public boolean cf0() {
        return HJN.LIZLLL;
    }

    @Override // X.InterfaceC81454Vxy
    public LiveEvent<CommentVideoModel> ee() {
        return this.LLIIIJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC81454Vxy getApiComponent() {
        LJJLIIIJJIZ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC81454Vxy
    public C6IE getPanelType() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC81454Vxy
    public LiveEvent<QaStruct> gk0() {
        return this.LLIIIZ;
    }

    @Override // X.InterfaceC81454Vxy
    public C40871j1<Object> oL() {
        return this.LLF;
    }

    @Override // X.InterfaceC81454Vxy
    public C40871j1<Object> sY() {
        return this.LLFII;
    }

    @Override // X.InterfaceC81454Vxy
    public boolean tw() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC81454Vxy
    public LiveData<Boolean> wu0() {
        return this.LLIIL;
    }

    @Override // X.InterfaceC81454Vxy
    public C40871j1<Object> zt0() {
        return this.LLD;
    }

    @Override // X.InterfaceC81454Vxy
    public void Bv(CommentVideoModel commentVideoModel) {
        java.util.Map<String, String> map;
        if (commentVideoModel == null) {
            return;
        }
        I1L i1l = this.LJLJJLL;
        String tabName = L10().getTabName();
        i1l.getClass();
        o.LJIIIZ(tabName, "tabName");
        C145995oB LIZ = i1l.LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL("tab_name", tabName);
            LIZ.LIZLLL("comment_id", commentVideoModel.getCommentId());
            LIZ.LIZLLL("comment_user_id", commentVideoModel.getUserId());
            LIZ.LIZLLL("group_id", commentVideoModel.getAwemeId());
            LIZ.LIZLLL("author_id", commentVideoModel.getAwemeUserId());
            map = LIZ.LIZ;
        } else {
            map = null;
        }
        GXR.LIZ("reply_comment_show", map);
        i1l.LJI++;
    }

    @Override // X.InterfaceC81454Vxy
    public void Dn(EnumC81464Vy8 enumC81464Vy8) {
        o.LJIIIZ(enumC81464Vy8, "<set-?>");
        this.LJLLILLLL = enumC81464Vy8;
    }

    @Override // X.InterfaceC81454Vxy
    public void KZ(boolean z) {
        this.LJLLJ = z;
    }

    public void LJJLIIIIJ(CommentVideoModel selectedStickerModel) {
        o.LJIIIZ(selectedStickerModel, "selectedStickerModel");
        InterfaceC81454Vxy LLJJI = LJJLIIJ().LLJJI();
        if (this.LJLLLL) {
            C62822Ol8 c62822Ol8 = C45934I1a.LIZ;
            Object value = c62822Ol8.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            if (((Keva) value).getBoolean("comment_panel_first_replace", true)) {
                Object value2 = c62822Ol8.getValue();
                o.LJIIIIZZ(value2, "<get-keva>(...)");
                ((Keva) value2).storeBoolean("comment_panel_first_replace", false);
                qd0(4);
                C26227ARb c26227ARb = new C26227ARb(C78688UuS.LJJIII(this));
                c26227ARb.LJFF(C78688UuS.LJJIII(this).getString(R.string.pn_));
                c26227ARb.LIZIZ(C78688UuS.LJJIII(this).getString(R.string.pn8));
                UC0.LIZJ(c26227ARb, new AqS111S0300000_7(selectedStickerModel, LLJJI, this, 36));
                c26227ARb.LJI().LIZLLL();
                return;
            }
        }
        LJLIIL(selectedStickerModel);
        Lz();
    }

    public final void LJJLIIIJJI(CommentStickerPanelResponse commentStickerPanelResponse) {
        List<CommentStickerPanelData> list = commentStickerPanelResponse.collection;
        if (list != null) {
            for (CommentStickerPanelData commentStickerPanelData : list) {
                Integer num = commentStickerPanelData.tabType;
                if (num != null) {
                    if (num.intValue() == 1) {
                        XL().LJI(commentStickerPanelData);
                    } else if (num.intValue() == 2) {
                        Vx().LJI(commentStickerPanelData);
                    }
                }
            }
            this.LLIILZL.setValue(Boolean.TRUE);
        }
    }

    public final List<Object> LJJLIIIJLLLLLLLZ(EnumC81461Vy5 type) {
        o.LJIIIZ(type, "type");
        switch (C81463Vy7.LIZ[type.ordinal()]) {
            case 1:
                return HJN.LIZJ;
            case 2:
                return this.LL.LJ;
            case 3:
                return this.LL.LIZJ;
            case 4:
                return HJN.LIZIZ;
            case 5:
                return this.LL.LIZLLL;
            case 6:
                return this.LL.LJFF;
            case 7:
                return this.LL.LJI;
            default:
                throw new C162476Zf();
        }
    }

    public final void LJJZZI(InviteRecommendMixQuestionStickerPanelResponseModel inviteRecommendMixQuestionStickerPanelResponseModel) {
        MixedQuestionCollection mixedQuestionCollection = inviteRecommendMixQuestionStickerPanelResponseModel.mixedQuestionCollection;
        if (mixedQuestionCollection != null) {
            this.LJZI = mixedQuestionCollection.nextPageToken;
            sY().LJI(mixedQuestionCollection);
            this.LLIL.setValue(Boolean.TRUE);
        }
    }

    public final void LJJZZIII(QuestionStickerPanelResponseModel questionStickerPanelResponseModel) {
        List<QuestionCollection> list = questionStickerPanelResponseModel.questionCollectionList;
        ArrayList arrayList = new ArrayList();
        for (QuestionCollection questionCollection : list) {
            if (questionCollection.category == I1P.QuestionCollectionINVITATION.ordinal()) {
                arrayList.add(questionCollection);
            }
        }
        if (!arrayList.isEmpty()) {
            zt0().LJI(ListProtector.get(arrayList, 0));
        }
        List<QuestionCollection> list2 = questionStickerPanelResponseModel.questionCollectionList;
        ArrayList arrayList2 = new ArrayList();
        for (QuestionCollection questionCollection2 : list2) {
            if (questionCollection2.category == I1P.QuestionCollectionFAVORITE.ordinal()) {
                arrayList2.add(questionCollection2);
            }
        }
        if (!arrayList2.isEmpty()) {
            oL().LJI(ListProtector.get(arrayList2, 0));
        }
        List<QuestionCollection> list3 = questionStickerPanelResponseModel.questionCollectionList;
        ArrayList arrayList3 = new ArrayList();
        for (QuestionCollection questionCollection3 : list3) {
            if (questionCollection3.category == I1P.QuestionCollectionRECOMMEND.ordinal()) {
                arrayList3.add(questionCollection3);
            }
        }
        if (!arrayList3.isEmpty()) {
            Q50().LJI(ListProtector.get(arrayList3, 0));
        }
        this.LLILIL.setValue(Boolean.TRUE);
    }

    public final void LJLIIL(CommentVideoModel commentVideoModel) {
        this.LJLLL = commentVideoModel;
        this.LJLLLL = true;
    }

    @Override // X.InterfaceC81454Vxy
    public boolean Z30(String tabTitle) {
        o.LJIIIZ(tabTitle, "tabTitle");
        if (I1R.LIZJ() && o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pq5))) {
            if (((Number) ListProtector.get(this.LL.LIZIZ.LIZIZ, 0)).intValue() == 2) {
                return true;
            }
        } else if (I1R.LIZLLL() && o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pmp))) {
            if (((Number) ListProtector.get(HJN.LIZ.LIZIZ, TW().indexOf(tabTitle))).intValue() == 2) {
                return true;
            }
        } else {
            if (I1R.LIZIZ()) {
                return this.LL.LIZJ(XD().indexOf(tabTitle));
            }
            if (o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pms)) && I1R.LIZLLL()) {
                return this.LL.LIZJ(TW().indexOf(tabTitle));
            }
            if (o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pms))) {
                return this.LL.LIZJ(XD().indexOf(tabTitle));
            }
            if (((Number) ListProtector.get(HJN.LIZ.LIZIZ, XD().indexOf(tabTitle))).intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC81454Vxy
    public void bg(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C6QQ.LIZ(new AqS154S0200000_7(this, (I1J) listener, (InterfaceC65784Pro<C76800UCe>) 129));
    }

    @Override // X.InterfaceC81454Vxy
    public void gH(QaStruct qaStruct) {
        o.LJIIIZ(qaStruct, "qaStruct");
        this.LLIIIL.LJII(qaStruct);
    }

    @Override // X.InterfaceC81454Vxy
    public boolean iR(EnumC81464Vy8 tabType) {
        o.LJIIIZ(tabType, "tabType");
        int i = C81463Vy7.LIZIZ[tabType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                return LJJLL();
            }
            return mg0();
        }
        return aO();
    }

    @Override // X.InterfaceC81454Vxy
    public boolean ni(String tabTitle) {
        o.LJIIIZ(tabTitle, "tabTitle");
        if (I1R.LIZJ() && o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pq5))) {
            if (((Number) ListProtector.get(this.LL.LIZIZ.LIZIZ, 0)).intValue() != 0) {
                return false;
            }
        } else {
            if (I1R.LIZLLL() && o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pmp))) {
                return HJN.LIZIZ(TW().indexOf(tabTitle));
            }
            if (I1R.LIZIZ()) {
                if (!this.LL.LIZIZ(XD().indexOf(tabTitle)) && !HJN.LIZIZ(XD().indexOf(tabTitle))) {
                    return false;
                }
            } else {
                if (o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pms)) && I1R.LIZLLL()) {
                    return this.LL.LIZIZ(TW().indexOf(tabTitle));
                }
                if (o.LJ(tabTitle, C78688UuS.LJJIII(this).getString(R.string.pms))) {
                    return this.LL.LIZIZ(XD().indexOf(tabTitle));
                }
                return HJN.LIZIZ(XD().indexOf(tabTitle));
            }
        }
        return true;
    }

    @Override // X.InterfaceC81454Vxy
    public void qd0(int i) {
        VideoPublishEditModel videoPublishEditModel = this.LJLJJLL.LIZIZ;
        if (videoPublishEditModel != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LIZ(i, "type");
            GXR.LIZ("replace_question_show", c145995oB.LIZ);
        }
    }

    @Override // X.InterfaceC81454Vxy
    public void se0(EnumC81461Vy5 itemType) {
        o.LJIIIZ(itemType, "itemType");
        String str = "click_comment_sticker";
        switch (C81463Vy7.LIZ[itemType.ordinal()]) {
            case 1:
            case 4:
                break;
            case 2:
                str = "click_favorite_sticker";
                break;
            case 3:
                str = "click_invitation_sticker";
                break;
            case 5:
                str = "click_recommendation_sticker";
                break;
            case 6:
                str = "click_ask_question_sticker";
                break;
            case 7:
                str = "click_mix_invite_recommend_sticker";
                break;
            default:
                throw new C162476Zf();
        }
        this.LJLJJLL.LIZJ(System.currentTimeMillis() / 1000, str);
    }

    @Override // X.InterfaceC81454Vxy
    public void vc(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        this.LLIILZL.observe(owner, new AObjectS86S0100000_7(this, 258));
        this.LLIL.observe(owner, new AObjectS86S0100000_7(this, 259));
        this.LLILIL.observe(owner, new AObjectS86S0100000_7(this, 260));
    }

    @Override // X.InterfaceC81454Vxy
    public void x00(InterfaceC88472Yns<? super Boolean, C76800UCe> onCommentStickerResp) {
        o.LJIIIZ(onCommentStickerResp, "onCommentStickerResp");
        if (!C60903NvH.LJIIJJI().getAccountService().isLogin()) {
            return;
        }
        if (!C45940I1g.LIZIZ()) {
            this.LLILLIZIL.LIZ(CommentStickerPanelRequestApi.LIZ(HJN.LIZ, 0, new AqS173S0100000_7(new I1M(this), 402), I1Q.Both.getValue(), 3).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(onCommentStickerResp, 71), new AfS59S0100000_7(onCommentStickerResp, 72)));
        }
        if (I1U.LIZ() != 0) {
            I1K i1k = this.LL;
            I1N i1n = new I1N(this);
            i1k.getClass();
            i1k.LIZ.LIZIZ(0, I1P.All.ordinal(), new AqS138S0200000_7(i1k, (I1K) i1n, (InterfaceC88472Yns<? super QuestionStickerPanelResponseModel, C76800UCe>) 109));
            i1k.LJII.LJII(Boolean.TRUE);
        }
        if (I1R.LIZJ()) {
            I1K i1k2 = this.LL;
            String str = this.LJZI;
            if (str == null) {
                str = "";
            }
            i1k2.LIZ(str, new I1O(this));
        }
    }

    @Override // X.InterfaceC81454Vxy
    public void C(String choice, int i) {
        o.LJIIIZ(choice, "choice");
        I1L i1l = this.LJLJJLL;
        i1l.getClass();
        VideoPublishEditModel videoPublishEditModel = i1l.LIZIZ;
        if (videoPublishEditModel != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LJI("target", choice);
            c145995oB.LIZ(i, "type");
            GXR.LIZ("replace_question_confirm", c145995oB.LIZ);
        }
    }

    @Override // X.InterfaceC81454Vxy
    public void DW(String str, String str2) {
        this.LJLJJLL.getClass();
        C188727au c188727au = new C188727au();
        if (str != null) {
            c188727au.LJI("enter_from", str);
        }
        if (str2 != null) {
            c188727au.LJI("enter_method", str2);
        }
        FMX.LJIIL("show_ask_question_bubble", c188727au.LIZ);
    }

    @Override // X.InterfaceC81454Vxy
    public void E20(String tabName, String enterMethod) {
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (I1R.LIZLLL()) {
            String str = this.LJLLI.get(tabName);
            if (str != null) {
                this.LJLJJLL.LIZIZ(str, enterMethod);
                return;
            }
            return;
        }
        String str2 = this.LJLL.get(tabName);
        if (str2 == null) {
            return;
        }
        this.LJLJJLL.LIZIZ(str2, enterMethod);
    }

    @Override // X.InterfaceC81454Vxy
    public void FG(String str, String str2) {
        this.LJLJJLL.getClass();
        C188727au c188727au = new C188727au();
        if (str != null) {
            c188727au.LJI("enter_from", str);
        }
        if (str2 != null) {
            c188727au.LJI("enter_method", str2);
        }
        FMX.LJIIL("ask_question", c188727au.LIZ);
    }

    @Override // X.InterfaceC81454Vxy
    public void Ko0(CommentVideoModel commentVideoModel, String tabTitle) {
        java.util.Map<String, String> map;
        o.LJIIIZ(tabTitle, "tabTitle");
        String str = this.LJLL.get(tabTitle);
        if (str != null) {
            I1L i1l = this.LJLJJLL;
            i1l.getClass();
            if (commentVideoModel == null) {
                return;
            }
            C145995oB LIZ = i1l.LIZ();
            if (LIZ != null) {
                LIZ.LIZLLL("tab_name", str);
                LIZ.LIZLLL("comment_id", commentVideoModel.getCommentId());
                LIZ.LIZLLL("comment_user_id", commentVideoModel.getUserId());
                LIZ.LIZLLL("group_id", commentVideoModel.getAwemeId());
                LIZ.LIZLLL("author_id", commentVideoModel.getAwemeUserId());
                map = LIZ.LIZ;
            } else {
                map = null;
            }
            GXR.LIZ("select_reply_comment", map);
        }
    }

    @Override // X.InterfaceC81454Vxy
    public void Li0(QaStruct qaStruct, String tabType) {
        java.util.Map<String, String> map;
        o.LJIIIZ(tabType, "tabType");
        if (qaStruct == null) {
            return;
        }
        I1L i1l = this.LJLJJLL;
        i1l.getClass();
        C145995oB LIZ = i1l.LIZ();
        if (LIZ != null) {
            LIZ.LIZIZ(qaStruct.getQuestionId(), "question_id");
            LIZ.LIZLLL("qa_sticker_category", tabType);
            map = LIZ.LIZ;
        } else {
            map = null;
        }
        GXR.LIZ("prop_click", map);
    }

    @Override // X.InterfaceC81454Vxy
    public void i50(CommentVideoModel model, String tabTitle) {
        java.util.Map<String, String> map;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(tabTitle, "tabTitle");
        String str = this.LJLL.get(tabTitle);
        if (str != null) {
            I1L i1l = this.LJLJJLL;
            i1l.getClass();
            C145995oB LIZ = i1l.LIZ();
            if (LIZ != null) {
                LIZ.LIZLLL("tab_name", str);
                LIZ.LIZLLL("comment_id", model.getCommentId());
                LIZ.LIZLLL("comment_user_id", model.getUserId());
                LIZ.LIZLLL("group_id", model.getAwemeId());
                LIZ.LIZLLL("author_id", model.getAwemeUserId());
                map = LIZ.LIZ;
            } else {
                map = null;
            }
            GXR.LIZ("replace_sticker_show", map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r0.intValue() != 1) goto L19;
     */
    @Override // X.InterfaceC81454Vxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lo(com.ss.android.ugc.aweme.sticker.data.QaStruct r10, X.EnumC81461Vy5 r11) {
        /*
            r9 = this;
            java.lang.String r0 = "itemType"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            if (r10 != 0) goto L8
            return
        L8:
            int[] r1 = X.C81463Vy7.LIZ
            int r0 = r11.ordinal()
            r1 = r1[r0]
            r0 = 2
            java.lang.String r7 = "qa_favorite_show"
            java.lang.String r6 = "qa_recommendation_show"
            java.lang.String r8 = "qa_invitation_show"
            if (r1 == r0) goto L34
            r0 = 3
            if (r1 == r0) goto L2a
            r0 = 5
            if (r1 == r0) goto L32
            r0 = 7
            if (r1 == r0) goto L2c
            return
        L23:
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L32
        L2a:
            r5 = r8
            goto L35
        L2c:
            java.lang.Integer r0 = r10.getCollectionCategory()
            if (r0 != 0) goto L23
        L32:
            r5 = r6
            goto L35
        L34:
            r5 = r7
        L35:
            X.I1L r4 = r9.LJLJJLL
            r4.getClass()
            X.5oB r2 = r4.LIZ()
            r3 = 0
            if (r2 == 0) goto L75
            long r0 = r10.getQuestionId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "question_id"
            r2.LIZLLL(r0, r1)
            int r0 = r10.getVideosCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "video_cnt"
            r2.LIZLLL(r0, r1)
            com.ss.android.ugc.aweme.question.InviteInfo r0 = r10.getInviteInfo()
            if (r0 == 0) goto L6a
            java.lang.Integer r3 = r0.getTotalInviterCount()
        L6a:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "username_show_cnt"
            r2.LIZLLL(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.LIZ
        L75:
            X.GXR.LIZ(r5, r3)
            int r1 = r5.hashCode()
            r0 = -1925433420(0xffffffff8d3c37b4, float:-5.7999023E-31)
            r2 = 1
            if (r1 == r0) goto La7
            r0 = 982282193(0x3a8c6fd1, float:0.0010714476)
            if (r1 == r0) goto L9a
            r0 = 1238053652(0x49cb3314, float:1664610.5)
            if (r1 == r0) goto L8e
        L8d:
            return
        L8e:
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L8d
            long r0 = r4.LJ
            long r0 = r0 + r2
            r4.LJ = r0
            goto L8d
        L9a:
            boolean r0 = r5.equals(r7)
            if (r0 != 0) goto La1
            goto L8d
        La1:
            long r0 = r4.LJFF
            long r0 = r0 + r2
            r4.LJFF = r0
            goto L8d
        La7:
            boolean r0 = r5.equals(r8)
            if (r0 != 0) goto Lae
            goto L8d
        Lae:
            long r0 = r4.LIZLLL
            long r0 = r0 + r2
            r4.LIZLLL = r0
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I1J.lo(com.ss.android.ugc.aweme.sticker.data.QaStruct, X.Vy5):void");
    }

    @Override // X.InterfaceC81454Vxy
    public void wo0(CommentVideoModel model, EnumC81461Vy5 itemType) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(itemType, "itemType");
        Dn(itemType.getCurrentTabType());
        this.LLIIIILZ.LJII(model);
    }

    @Override // X.InterfaceC81454Vxy
    public void hk(String tabName, int i, int i2) {
        java.util.Map<String, String> map;
        o.LJIIIZ(tabName, "tabName");
        String str = this.LJLL.get(tabName);
        if (str != null) {
            I1L i1l = this.LJLJJLL;
            i1l.getClass();
            C145995oB LIZ = i1l.LIZ();
            if (LIZ != null) {
                LIZ.LIZLLL("tab_name", str);
                LIZ.LIZ(i2, "is_landing");
                LIZ.LIZ(i, "is_blank");
                map = LIZ.LIZ;
            } else {
                map = null;
            }
            GXR.LIZ("reply_panel_show", map);
        }
    }

    @Override // X.InterfaceC81454Vxy
    public void jV(CommentVideoModel model, String tabTitle, String option) {
        java.util.Map<String, String> map;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(tabTitle, "tabTitle");
        o.LJIIIZ(option, "option");
        String str = this.LJLL.get(tabTitle);
        if (str != null) {
            I1L i1l = this.LJLJJLL;
            i1l.getClass();
            C145995oB LIZ = i1l.LIZ();
            if (LIZ != null) {
                LIZ.LIZLLL("target", option);
                LIZ.LIZLLL("tab_name", str);
                LIZ.LIZLLL("comment_id", model.getCommentId());
                LIZ.LIZLLL("comment_user_id", model.getUserId());
                LIZ.LIZLLL("group_id", model.getAwemeId());
                LIZ.LIZLLL("author_id", model.getAwemeUserId());
                map = LIZ.LIZ;
            } else {
                map = null;
            }
            GXR.LIZ("replace_sticker_confirm", map);
        }
    }

    @Override // X.InterfaceC81454Vxy
    public void jk(EnumC81461Vy5 type, int i, InterfaceC65784Pro<C76800UCe> loadMoreUiCallBack) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(loadMoreUiCallBack, "loadMoreUiCallBack");
        this.LJLJJLL.LJIIIIZZ++;
        int i2 = C81463Vy7.LIZ[type.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                        I1K i1k = this.LL;
                        AqS138S0200000_7 aqS138S0200000_7 = new AqS138S0200000_7(this, loadMoreUiCallBack, 97);
                        i1k.getClass();
                        i1k.LIZ.LIZIZ(i, I1P.QuestionCollectionRECOMMEND.ordinal(), aqS138S0200000_7);
                        i1k.LJII.LJII(Boolean.TRUE);
                        return;
                    }
                    CommentStickerPanelRequestApi.LIZ(HJN.LIZ, i, new AqS138S0200000_7(this, loadMoreUiCallBack, 100), I1Q.Recommended.getValue(), 2);
                    return;
                }
                I1K i1k2 = this.LL;
                AqS138S0200000_7 aqS138S0200000_72 = new AqS138S0200000_7(this, loadMoreUiCallBack, 96);
                i1k2.getClass();
                i1k2.LIZ.LIZIZ(i, I1P.QuestionCollectionINVITATION.ordinal(), aqS138S0200000_72);
                i1k2.LJII.LJII(Boolean.TRUE);
                return;
            }
            I1K i1k3 = this.LL;
            AqS138S0200000_7 aqS138S0200000_73 = new AqS138S0200000_7(this, loadMoreUiCallBack, 98);
            i1k3.getClass();
            i1k3.LIZ.LIZIZ(i, I1P.QuestionCollectionFAVORITE.ordinal(), aqS138S0200000_73);
            i1k3.LJII.LJII(Boolean.TRUE);
            return;
        }
        CommentStickerPanelRequestApi.LIZ(HJN.LIZ, i, new AqS173S0100000_7(new AqS138S0200000_7(this, loadMoreUiCallBack, 99), 403), I1Q.Favorites.getValue(), 2);
    }

    public I1J(C82622Wbi objectContainer, WMH parentScene, int i, CommentVideoModel commentVideoModel, C6IE panelType, I1L mobHelper) {
        boolean z;
        o.LJIIIZ(objectContainer, "objectContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(panelType, "panelType");
        o.LJIIIZ(mobHelper, "mobHelper");
        this.LJLIL = objectContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = commentVideoModel;
        this.LJLJJL = panelType;
        this.LJLJJLL = mobHelper;
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 670));
        String string = C78688UuS.LJJIII(this).getString(R.string.pq5);
        o.LJIIIIZZ(string, "context.getString(R.string.qarec_tab_title)");
        String string2 = C78688UuS.LJJIII(this).getString(R.string.pms);
        o.LJIIIIZZ(string2, "context.getString(R.stri…screen_favorites_tabname)");
        this.LJLJLJ = C47261Igj.LJJIJIIJI(string, string2);
        this.LJLJLLL = C47261Igj.LJJIJIIJI(C78688UuS.LJJIII(this).getString(R.string.pms), C78688UuS.LJJIII(this).getString(R.string.pq5), C78688UuS.LJJIII(this).getString(R.string.pmp));
        this.LJLL = C113554cx.LJJL(new OSZ(ListProtector.get(XD(), 0), "recommend"), new OSZ(ListProtector.get(XD(), 1), "favorite"));
        this.LJLLI = C113554cx.LJJL(new OSZ(ListProtector.get(TW(), 0), "favorite"), new OSZ(ListProtector.get(TW(), 1), "Q&A"), new OSZ(ListProtector.get(TW(), 2), "comment"));
        EnumC81464Vy8 enumC81464Vy8 = EnumC81464Vy8.SUGGEST_TAB;
        this.LJLLILLLL = enumC81464Vy8;
        if (commentVideoModel != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLL = z;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLLLLLL = mutableLiveData;
        this.LJLZ = mutableLiveData;
        this.LJZ = new MutableLiveData<>();
        I1K i1k = new I1K();
        this.LL = i1k;
        this.LLD = new C40871j1<>(i1k.LIZJ);
        this.LLF = new C40871j1<>(i1k.LJ);
        this.LLFF = new C40871j1<>(i1k.LIZLLL);
        this.LLFFF = new C40871j1<>(HJN.LIZJ);
        this.LLFII = new C40871j1<>(i1k.LJI);
        this.LLFZ = new C40871j1<>(HJN.LIZIZ);
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this.LLI = c29901Fi;
        this.LLIFFJFJJ = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LLII = c29901Fi2;
        this.LLIIII = c29901Fi2;
        C29901Fi<CommentVideoModel> c29901Fi3 = new C29901Fi<>();
        this.LLIIIILZ = c29901Fi3;
        this.LLIIIJ = c29901Fi3;
        C29901Fi<QaStruct> c29901Fi4 = new C29901Fi<>();
        this.LLIIIL = c29901Fi4;
        this.LLIIIZ = c29901Fi4;
        C29901Fi<C76800UCe> c29901Fi5 = new C29901Fi<>();
        this.LLIIJI = c29901Fi5;
        this.LLIIJLIL = c29901Fi5;
        this.LLIIL = new MutableLiveData<>(Boolean.FALSE);
        this.LLIILII = new ArrayList();
        this.LLIILZL = new MutableLiveData<>();
        this.LLIIZ = new AObjectS86S0100000_7(this, 257);
        this.LLIL = new MutableLiveData<>();
        this.LLILII = new AObjectS86S0100000_7(this, 261);
        this.LLILIL = new MutableLiveData<>();
        this.LLILL = new AObjectS86S0100000_7(this, 262);
        this.LLILLIZIL = new C73318Sq2();
        this.LLILLJJLI = true;
        this.LLILLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 671));
        this.LJLLL = commentVideoModel;
        this.LJZL = C113554cx.LJJLIIIIJ(new OSZ(enumC81464Vy8, new ArrayList()), new OSZ(EnumC81464Vy8.FAVORITE_TAB, new ArrayList()));
        this.LLILZ = new C29901Fi<>();
    }
}
