package X;

import Y.ARunnableS38S0100000_2;
import Y.IDLListenerS190S0100000_2;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.port.in.IEmojiService;
import com.ss.android.ugc.aweme.servicimpl.EmojiServiceImplDiff;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C156086Aq extends LinearLayout implements InterfaceC1549166d<C67A> {
    public View LJLIL;
    public CommentVideoModel LJLILLLLZI;
    public InterfaceC156096Ar LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public InterfaceC156116At LJLJL;
    public View LJLJLJ;
    public InterfaceC1557069e LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public boolean LJLLL;

    public int getMLayoutId() {
        return R.layout.wb;
    }

    public int getMReplyTextId() {
        return R.string.q28;
    }

    public final void setEnableEdit(boolean z) {
    }

    private final OPX getAvatarView() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-avatarView>(...)");
        return (OPX) value;
    }

    private final TuxTextView getCommentTextView() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-commentTextView>(...)");
        return (TuxTextView) value;
    }

    private final SafeHandler getHandler() {
        return (SafeHandler) this.LJLJJLL.getValue();
    }

    private final LinearLayout getTextLayout() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-textLayout>(...)");
        return (LinearLayout) value;
    }

    @Override // X.InterfaceC1549166d
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C67A LJIJ() {
        CommentVideoModel commentVideoModel;
        InteractStickerStruct interactStickerStruct;
        InteractStickerStruct interactStickerStruct2;
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        }
        CommentVideoModel commentVideoModel2 = this.LJLILLLLZI;
        if (commentVideoModel2 == null) {
            commentVideoModel = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        } else {
            commentVideoModel = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
            commentVideoModel.setStartTime(commentVideoModel2.getStartTime());
            commentVideoModel.setEndTime(commentVideoModel2.getEndTime());
        }
        InterfaceC156096Ar interfaceC156096Ar = this.LJLJI;
        if (interfaceC156096Ar == null || (interactStickerStruct2 = interfaceC156096Ar.getInteractStickerStruct()) == null) {
            interactStickerStruct = new InteractStickerStruct();
        } else {
            interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(interactStickerStruct2.getType());
            interactStickerStruct.setIndex(interactStickerStruct2.getIndex());
            interactStickerStruct.setAttr(interactStickerStruct2.getAttr());
            interactStickerStruct.setTrackList(interactStickerStruct2.getTrackList());
        }
        return new C67A(commentVideoModel, interactStickerStruct);
    }

    public final boolean LIZJ() {
        boolean z;
        int i = 0;
        if (this.LJLILLLLZI != null) {
            Object obj = this.LJLJLLL;
            if (obj != null) {
                if (!((C6BL) obj).LJIL() && !this.LJLLL) {
                    CommentVideoModel commentVideoModel = this.LJLILLLLZI;
                    o.LJI(commentVideoModel);
                    boolean isVisibleWhen = commentVideoModel.isVisibleWhen(this.LJLJJL);
                    if (isVisibleWhen && 4 == getVisibility()) {
                        z = true;
                    } else {
                        z = false;
                        if (!isVisibleWhen) {
                            i = 4;
                        }
                    }
                    C162696a1.LJ(i, this);
                    return z;
                }
            } else {
                o.LJIJI("controller");
                throw null;
            }
        }
        return false;
    }

    public final TuxTextView getReplyTextView() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-replyTextView>(...)");
        return (TuxTextView) value;
    }

    public final void LIZIZ() {
        int width = getTextLayout().getWidth();
        View view = this.LJLIL;
        if (view != null) {
            int width2 = view.getWidth() - getTextLayout().getWidth();
            if (getCommentTextView().getWidth() < width && getReplyTextView().getWidth() < width) {
                getLayoutParams().width = Math.max(getCommentTextView().getWidth(), getReplyTextView().getWidth()) + width2;
                requestLayout();
                getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 10));
                return;
            }
            if (getCommentTextView().getLineCount() <= 6) {
                LJ(15.0f, 18.0f);
            } else if (getCommentTextView().getLineCount() <= 9) {
                LJ(13.0f, 15.0f);
            } else {
                LJ(11.0f, 12.0f);
            }
            getCommentTextView().setMaxLines(8);
            getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 10));
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        if (getData() != null) {
            CommentVideoModel data = getData();
            o.LJI(data);
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                o.LJI(data2);
                return data2.getStartTime();
            }
        }
        return 0;
    }

    public final CommentVideoModel getData() {
        return this.LJLILLLLZI;
    }

    public final View getMHintIcon() {
        return this.LJLJLJ;
    }

    public final String getMUserName() {
        return this.LJLJJI;
    }

    private final void setAvatarImage(UrlModel urlModel) {
        if (urlModel == null) {
            return;
        }
        C78764Uvg.LJFF(getAvatarView(), urlModel);
    }

    private final void setCommentMsg(String str) {
        IEmojiService iEmojiService;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (C90193gN.LIZIZ(getContext())) {
            getCommentTextView().setGravity(5);
        }
        getCommentTextView().setText(str);
        Object LIZ = C58096Mr6.LIZ(IEmojiService.class, false);
        if (LIZ != null) {
            iEmojiService = (IEmojiService) LIZ;
        } else {
            if (C58096Mr6.n6 == null) {
                synchronized (IEmojiService.class) {
                    if (C58096Mr6.n6 == null) {
                        C58096Mr6.n6 = new EmojiServiceImplDiff();
                    }
                }
            }
            iEmojiService = C58096Mr6.n6;
        }
        iEmojiService.LIZ(getCommentTextView());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" commentMsg: ");
        LIZ2.append(str);
        LIZ2.append("  commentTextView： ");
        LIZ2.append((Object) getCommentTextView().getText());
        LIZ2.append("  color: ");
        LIZ2.append(getCommentTextView().getCurrentTextColor());
        LIZ2.append("  setColor: ");
        LIZ2.append(C04330Ez.LIZIZ(getContext(), R.color.ck));
        H7B.LIZ(X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        if (getData() != null) {
            CommentVideoModel data = getData();
            o.LJI(data);
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                o.LJI(data2);
                return data2.getEndTime();
            }
            return i;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        if (getData() != null) {
            CommentVideoModel data = getData();
            o.LJI(data);
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                o.LJI(data2);
                return data2.getStartTime();
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        if (getData() != null) {
            CommentVideoModel data = getData();
            o.LJI(data);
            if (data.hasTimeData()) {
                CommentVideoModel data2 = getData();
                o.LJI(data2);
                return data2.getEndTime();
            }
            return i;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        setAlpha(f);
    }

    public final void setController(InterfaceC1557069e controller) {
        o.LJIIIZ(controller, "controller");
        this.LJLJLLL = controller;
    }

    public final void setDumpData(InterfaceC156096Ar dumpData) {
        o.LJIIIZ(dumpData, "dumpData");
        this.LJLJI = dumpData;
    }

    public final void setMHintIcon(View view) {
        this.LJLJLJ = view;
    }

    public final void setMUserName(String str) {
        this.LJLJJI = str;
    }

    public final void setPlayPosition(long j) {
        this.LJLJJL = j;
    }

    public final void setTouching(boolean z) {
        if (z == this.LJLLL) {
            return;
        }
        this.LJLLL = z;
        if (!z) {
            SystemClock.elapsedRealtime();
            getHandler().postDelayed(new ARunnableS38S0100000_2(this, 182), 1000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156086Aq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 977));
        this.LJLL = C221108m2.LIZIZ(new AqS103S0101000_2(this, 0, 8));
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 976));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 978));
        this.LJLLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 979));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getMLayoutId(), this, true);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(mLayoutId, this, true)");
        this.LJLIL = LLLLIILL;
        setOrientation(0);
        setVisibility(4);
    }

    public final void LIZLLL(CommentVideoModel commentVideoModel, InterfaceC156116At interfaceC156116At) {
        UrlModel urlModel;
        String str;
        this.LJLILLLLZI = commentVideoModel;
        this.LJLJL = interfaceC156116At;
        String str2 = null;
        if (commentVideoModel != null) {
            urlModel = commentVideoModel.getUserAvatar();
        } else {
            urlModel = null;
        }
        setAvatarImage(urlModel);
        CommentVideoModel commentVideoModel2 = this.LJLILLLLZI;
        if (commentVideoModel2 != null) {
            str = commentVideoModel2.getCommentMsg();
        } else {
            str = null;
        }
        setCommentMsg(str);
        CommentVideoModel commentVideoModel3 = this.LJLILLLLZI;
        if (commentVideoModel3 != null) {
            str2 = commentVideoModel3.getUserName();
        }
        this.LJLJJI = str2;
        if (!TextUtils.isEmpty(str2)) {
            getReplyTextView().setText(getContext().getResources().getString(getMReplyTextId(), this.LJLJJI));
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 9));
    }

    public final void LJ(float f, float f2) {
        int fontMetricsInt;
        getCommentTextView().setTextSize(0, C170576mj.LIZ(getContext(), f));
        TuxTextView commentTextView = getCommentTextView();
        int LIZ = (int) C170576mj.LIZ(getContext(), f2);
        if (commentTextView == null || commentTextView.getPaint() == null || LIZ == (fontMetricsInt = commentTextView.getPaint().getFontMetricsInt(null))) {
            return;
        }
        commentTextView.setLineSpacing(LIZ - fontMetricsInt, 1.0f);
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(C67A c67a, int i, int i2) {
        int i3;
        int i4;
        InteractStickerStruct interactStickerStruct;
        C67A c67a2 = c67a;
        CommentVideoModel commentVideoModel = this.LJLILLLLZI;
        if (commentVideoModel != null) {
            CommentVideoModel commentVideoModel2 = c67a2.LJLIL;
            if (commentVideoModel2 != null) {
                i3 = commentVideoModel2.getStartTime();
            } else {
                i3 = 0;
            }
            commentVideoModel.setStartTime(i3);
        }
        CommentVideoModel commentVideoModel3 = this.LJLILLLLZI;
        if (commentVideoModel3 != null) {
            CommentVideoModel commentVideoModel4 = c67a2.LJLIL;
            if (commentVideoModel4 != null) {
                i4 = commentVideoModel4.getEndTime();
            } else {
                i4 = 0;
            }
            commentVideoModel3.setEndTime(i4);
        }
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(c67a2.LJLILLLLZI);
        InterfaceC156096Ar interfaceC156096Ar = this.LJLJI;
        if (interfaceC156096Ar != null) {
            interactStickerStruct = interfaceC156096Ar.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(interactStickerStruct);
        if (LIZIZ != null && LIZIZ2 != null) {
            LIZIZ.setRotation(LIZIZ.getRotation() - LIZIZ2.getRotation());
            if (!o.LIZJ(LIZIZ2.getScale(), 0.0f)) {
                float floatValue = LIZIZ.getScale().floatValue();
                Float scale = LIZIZ2.getScale();
                o.LJIIIIZZ(scale, "newLocation.scale");
                LIZIZ.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LIZIZ);
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), arrayList);
            InteractStickerStruct interactStickerStruct2 = c67a2.LJLILLLLZI;
            if (interactStickerStruct2 != null) {
                interactStickerStruct2.setTrackList(json);
            }
            InterfaceC156096Ar interfaceC156096Ar2 = this.LJLJI;
            if (interfaceC156096Ar2 != null) {
                ((C6BL) interfaceC156096Ar2).LJJIIZ(false);
            }
            InterfaceC156096Ar interfaceC156096Ar3 = this.LJLJI;
            if (interfaceC156096Ar3 != null) {
                ((C6BL) interfaceC156096Ar3).LJJIIJZLJL(c67a2.LJLILLLLZI, Boolean.FALSE);
            }
            InterfaceC156096Ar interfaceC156096Ar4 = this.LJLJI;
            if (interfaceC156096Ar4 != null) {
                ((C6BL) interfaceC156096Ar4).LJJIIZ(true);
            }
        }
    }
}
