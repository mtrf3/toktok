package X;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import kotlin.jvm.internal.AqS7S0010000_2;

/* renamed from: X.69a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1556669a extends C6BL implements InterfaceC1557069e {
    public CommentVideoModel LLI;
    public String LLIFFJFJJ;
    public final VideoPublishEditModel LLII;
    public EditCommentStickerViewModel LLIIII;

    @Override // X.C6BL
    public final void LIZLLL(boolean z) {
        throw null;
    }

    @Override // X.C6BL
    public final int LJIIJ() {
        return R.string.e3o;
    }

    @Override // X.C6BL
    public final int LJIIJJI() {
        return 4;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 4;
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLI != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        EditCommentStickerViewModel editCommentStickerViewModel = this.LLIIII;
        if (editCommentStickerViewModel != null) {
            return editCommentStickerViewModel.Hv0((C1AU) this.LJZL).getInTimeEditView();
        }
        return false;
    }

    public static final String LJJIJLIJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pi_start");
        LIZ.append(UUID.randomUUID().toString());
        LIZ.append("pi_end");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C6BL
    public final void LJJII() {
        super.LJJII();
        this.LLI = null;
        EditCommentStickerViewModel editCommentStickerViewModel = this.LLIIII;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.setState(new AqS7S0010000_2(false, 27));
        }
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        if (LJIILLIIL() && this.LJLL != null) {
            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
            if (this.LLI.isQuestion()) {
                interactStickerStruct.setType(7);
                interactStickerStruct.setIndex(5);
            } else {
                interactStickerStruct.setType(4);
                interactStickerStruct.setIndex(2);
            }
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            normalTrackTimeStamp.setRotation(C6BL.LJIILJJIL(this.LJLL.getRotateAngle()));
            normalTrackTimeStamp.setScale(Float.valueOf(this.LJLL.getScale()));
            PointF LIZIZ = LIZIZ(this.LJLL.getCenterViewPoint());
            normalTrackTimeStamp.setX(LIZIZ.x);
            normalTrackTimeStamp.setY(LIZIZ.y);
            normalTrackTimeStamp.setStartTime(this.LLI.getStartTime());
            normalTrackTimeStamp.setEndTime(this.LLI.getEndTime());
            PointF LIZIZ2 = LIZIZ(new PointF(this.LJLL.getContentViewWidth(), this.LJLL.getContentViewHeight()));
            normalTrackTimeStamp.setWidth(LIZIZ2.x);
            normalTrackTimeStamp.setHeight(LIZIZ2.y);
            linkedList.add(normalTrackTimeStamp);
            C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
            HashMap hashMap = new HashMap();
            hashMap.put("comment_sticker_id", CardStruct.IStatusCode.DEFAULT);
            interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), hashMap));
            return interactStickerStruct;
        }
        return null;
    }

    public C1556669a(VideoPublishEditModel videoPublishEditModel) {
        this.LLII = videoPublishEditModel;
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(final Context context) {
        CommentVideoModel commentVideoModel = this.LLI;
        if (commentVideoModel != null && commentVideoModel.isQuestion()) {
            C1557369h c1557369h = new C1557369h(context) { // from class: X.69c
                @Override // X.C1557369h
                public final void LJJ() {
                    C16880lQ.LLLZIIL(R.layout.bnd, C16880lQ.LLZIL(this.LJLIL), this);
                }
            };
            c1557369h.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            c1557369h.setController(this);
            c1557369h.setDumpData(this);
            c1557369h.setLockMode(true);
            return c1557369h;
        }
        C1557369h c1557369h2 = new C1557369h(context);
        c1557369h2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c1557369h2.setController(this);
        c1557369h2.setDumpData(this);
        c1557369h2.setLockMode(true);
        return c1557369h2;
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By c156426By) {
        if (!(c156426By instanceof C1557369h)) {
            return false;
        }
        boolean LJJIII = super.LJJIII(c156426By);
        this.LLI = null;
        EditCommentStickerViewModel editCommentStickerViewModel = this.LLIIII;
        editCommentStickerViewModel.getClass();
        editCommentStickerViewModel.setState(new AqS7S0010000_2(false, 27));
        if (this.LLII.commentVideoModel.isCommentFromEditPanel()) {
            this.LLII.commentVideoModel = null;
        }
        return LJJIII;
    }

    @Override // X.C6BL
    public final void LJJIJ(String str) {
        if (!C38354F3m.LJ(str)) {
            if (str.contains("pi_start") && str.contains("pi_end")) {
                this.LJLLLL = str.replaceAll("pi_start(.*?)pi_end", LJJIJLIJ());
                return;
            }
            if (str.endsWith(File.separator)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(LJJIJLIJ());
                this.LJLLLL = X1D.LIZIZ(LIZ);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(LJJIJLIJ());
            this.LJLLLL = X1D.LIZIZ(LIZ2);
        }
    }

    @Override // X.C6BL
    public final void LJIJ(Context context, FrameLayout frameLayout) {
        super.LJIJ(context, frameLayout);
        this.LLIIII = (EditCommentStickerViewModel) C163726bg.LIZJ(frameLayout).LIZ(EditCommentStickerViewModel.class);
        this.LLFF = false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.67G] */
    public final void LJJIL(CommentVideoModel commentVideoModel, final InteractStickerStruct interactStickerStruct) {
        this.LLI = commentVideoModel;
        EditCommentStickerViewModel editCommentStickerViewModel = this.LLIIII;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.setState(new AqS7S0010000_2(true, 27));
        }
        if (interactStickerStruct != null && commentVideoModel != null) {
            EditCommentStickerViewModel editCommentStickerViewModel2 = this.LLIIII;
            if (editCommentStickerViewModel2 != null) {
                editCommentStickerViewModel2.setState(new AqS7S0010000_2(true, 27));
            }
            this.LLI = commentVideoModel;
            super.LIZLLL(true);
            C156426By c156426By = this.LJLL;
            if (c156426By instanceof C1557369h) {
                ((C1557369h) c156426By).LJJI();
            }
            C6BO c6bo = this.LJLLILLLL;
            if (c6bo != null) {
                c6bo.LJII();
            }
            this.LLIFFJFJJ = (String) ((HashMap) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.2ZE
            }.getType())).get("comment_sticker_id");
        }
        C1557369h c1557369h = (C1557369h) this.LJLL;
        ?? r2 = new InterfaceC156116At() { // from class: X.67G
            @Override // X.InterfaceC156116At
            public final void LIZ() {
                C1556669a.this.LJJIFFI(interactStickerStruct);
            }
        };
        c1557369h.setVisibility(4);
        C156086Aq c156086Aq = c1557369h.LLIIIZ;
        if (c156086Aq != null) {
            c156086Aq.LIZLLL(commentVideoModel, new C67M(c1557369h, r2));
        }
    }

    public final void LJJIZ(CommentVideoModel commentVideoModel, boolean z, boolean z2) {
        EditCommentStickerViewModel editCommentStickerViewModel = this.LLIIII;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.setState(new AqS7S0010000_2(true, 27));
        }
        this.LLI = commentVideoModel;
        super.LIZLLL(z);
        C156426By c156426By = this.LJLL;
        if (c156426By instanceof C1557369h) {
            ((C1557369h) c156426By).LJJI();
        }
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LJII();
        }
    }
}
