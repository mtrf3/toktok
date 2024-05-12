package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.InviteInfo;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VyF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81471VyF extends AbstractC029409q<C81473VyH> {
    public final Context LJLIL;
    public final EnumC81461Vy5 LJLILLLLZI;
    public final InterfaceC81454Vxy LJLJI;
    public final List<Object> LJLJJI;
    public final InterfaceC88472Yns<Object, C76800UCe> LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.size();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C81473VyH holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.LJLILLLLZI.getCurrentTabType() == this.LJLJI.L10()) {
            int i = C81468VyC.LIZ[this.LJLILLLLZI.ordinal()];
            CommentVideoModel commentVideoModel = null;
            QaStruct qaStruct = null;
            if (i != 1 && i != 2) {
                InterfaceC81454Vxy interfaceC81454Vxy = this.LJLJI;
                Object obj = ListProtector.get(this.LJLJJI, holder.getAdapterPosition());
                if (obj instanceof QaStruct) {
                    qaStruct = (QaStruct) obj;
                }
                interfaceC81454Vxy.lo(qaStruct, this.LJLILLLLZI);
                return;
            }
            InterfaceC81454Vxy interfaceC81454Vxy2 = this.LJLJI;
            Object obj2 = ListProtector.get(this.LJLJJI, holder.getAdapterPosition());
            if (obj2 instanceof CommentVideoModel) {
                commentVideoModel = (CommentVideoModel) obj2;
            }
            interfaceC81454Vxy2.Bv(commentVideoModel);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C81473VyH c81473VyH, int i) {
        C81472VyG c81472VyG;
        QaStruct qaStruct;
        Integer num;
        User user;
        String str;
        List<User> inviterList;
        Integer num2;
        C81477VyL c81477VyL;
        CommentVideoModel commentVideoModel;
        C81473VyH holder = c81473VyH;
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLJJI, i);
        View view = holder.LJLIL;
        if ((view instanceof C81477VyL) && (c81477VyL = (C81477VyL) view) != null) {
            if (obj instanceof CommentVideoModel) {
                commentVideoModel = (CommentVideoModel) obj;
            } else {
                commentVideoModel = null;
            }
            c81477VyL.setCommentStickerData(commentVideoModel);
        }
        View view2 = holder.LJLIL;
        if ((view2 instanceof C81472VyG) && (c81472VyG = (C81472VyG) view2) != null && (obj instanceof QaStruct) && (qaStruct = (QaStruct) obj) != null) {
            UrlModel avatarUrl = qaStruct.getAvatarUrl();
            if (avatarUrl != null) {
                c81472VyG.LJLLI = avatarUrl;
                OPX opx = c81472VyG.LJLILLLLZI;
                if (opx != null) {
                    C78764Uvg.LJI(opx, avatarUrl, -1, -1);
                } else {
                    o.LJIJI("avatarImage");
                    throw null;
                }
            }
            String questionContent = qaStruct.getQuestionContent();
            if (questionContent != null) {
                T5T t5t = c81472VyG.LJLJI;
                if (t5t != null) {
                    t5t.setText(questionContent);
                } else {
                    o.LJIJI("questionEditText");
                    throw null;
                }
            }
            c81472VyG.LJLJL = qaStruct.getQuestionId();
            c81472VyG.LJLJLJ = qaStruct.getUserId();
            c81472VyG.LJLJLLL = qaStruct.getSecId();
            c81472VyG.LJLJJLL = qaStruct.getItemId();
            String userName = qaStruct.getUserName();
            if (userName == null) {
                userName = "";
            }
            c81472VyG.LJLL = userName;
            c81472VyG.LJLLILLLL = qaStruct.getVideosCount();
            Integer collectionCategory = qaStruct.getCollectionCategory();
            if (collectionCategory == null || collectionCategory.intValue() != 1 || (C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) != 3 && C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) != 4)) {
                if (C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 1 || C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 2 || C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 3 || C00F.LIZ(31744, 0, "studio_improve_qa_reply_panel", true) == 4) {
                    qaStruct.getVideosCount();
                    TuxTextView tuxTextView = c81472VyG.LJLJJI;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(C77123UOp.LJJIIJ(c81472VyG.LJLLILLLL));
                        LIZ.append(' ');
                        LIZ.append(c81472VyG.getContext().getString(R.string.tqm));
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        TuxTextView tuxTextView2 = c81472VyG.LJLJJI;
                        if (tuxTextView2 != null) {
                            String lowerCase = LIZIZ.toLowerCase(Locale.ROOT);
                            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            tuxTextView2.setText(lowerCase);
                            TuxTextView tuxTextView3 = c81472VyG.LJLJJI;
                            if (tuxTextView3 != null) {
                                tuxTextView3.setAllCaps(false);
                                return;
                            } else {
                                o.LJIJI("viewsCountTextView");
                                throw null;
                            }
                        }
                        o.LJIJI("viewsCountTextView");
                        throw null;
                    }
                    o.LJIJI("viewsCountTextView");
                    throw null;
                }
                return;
            }
            TuxTextView tuxTextView4 = c81472VyG.LJLJJL;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
                InviteInfo inviteInfo = qaStruct.getInviteInfo();
                if (inviteInfo != null) {
                    num = inviteInfo.getTotalInviterCount();
                } else {
                    num = null;
                }
                o.LJII(num, "null cannot be cast to non-null type kotlin.Int");
                int intValue = num.intValue();
                if (intValue > 1) {
                    Context context = c81472VyG.getContext();
                    Object[] objArr = new Object[1];
                    InviteInfo inviteInfo2 = qaStruct.getInviteInfo();
                    if (inviteInfo2 != null) {
                        num2 = inviteInfo2.getTotalInviterCount();
                    } else {
                        num2 = null;
                    }
                    objArr[0] = num2;
                    String string = context.getString(R.string.pmx, objArr);
                    o.LJIIIIZZ(string, "context.getString(R.stri…eInfo?.totalInviterCount)");
                    TuxTextView tuxTextView5 = c81472VyG.LJLJJL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(string);
                        return;
                    } else {
                        o.LJIJI("stickerInviteInfoTextView");
                        throw null;
                    }
                }
                if (intValue != 1) {
                    return;
                }
                InviteInfo inviteInfo3 = qaStruct.getInviteInfo();
                if (inviteInfo3 != null && (inviterList = inviteInfo3.getInviterList()) != null) {
                    user = (User) ListProtector.get(inviterList, 0);
                } else {
                    user = null;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("");
                if (user != null) {
                    str = user.getNickname();
                } else {
                    str = null;
                }
                LIZ2.append(str);
                LIZ2.append(' ');
                LIZ2.append(c81472VyG.getContext().getString(R.string.pos));
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                TuxTextView tuxTextView6 = c81472VyG.LJLJJL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(LIZIZ2);
                    return;
                } else {
                    o.LJIJI("stickerInviteInfoTextView");
                    throw null;
                }
            }
            o.LJIJI("stickerInviteInfoTextView");
            throw null;
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C81473VyH com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View stickerView;
        o.LJIIIZ(parent, "parent");
        switch (C81468VyC.LIZ[this.LJLILLLLZI.ordinal()]) {
            case 1:
            case 2:
                stickerView = new C81477VyL(this.LJLIL);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                stickerView = new C81472VyG(context, null, 0);
                break;
            case 7:
                stickerView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.hs, parent, false);
                break;
            default:
                throw new C162476Zf();
        }
        o.LJIIIIZZ(stickerView, "stickerView");
        C81473VyH c81473VyH = new C81473VyH(this, stickerView);
        C0AX.LIZ(parent, c81473VyH.itemView, R.id.lj7);
        View view = c81473VyH.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c81473VyH.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C81473VyH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c81473VyH.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c81473VyH.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C81473VyH.class.getName();
        return c81473VyH;
    }

    public C81471VyF(Context context, EnumC81461Vy5 itemType, InterfaceC81454Vxy commentAndQuestionStickerPanelApi, List dataSource, AqS180S0100000_14 aqS180S0100000_14) {
        o.LJIIIZ(itemType, "itemType");
        o.LJIIIZ(commentAndQuestionStickerPanelApi, "commentAndQuestionStickerPanelApi");
        o.LJIIIZ(dataSource, "dataSource");
        this.LJLIL = context;
        this.LJLILLLLZI = itemType;
        this.LJLJI = commentAndQuestionStickerPanelApi;
        this.LJLJJI = dataSource;
        this.LJLJJL = aqS180S0100000_14;
        dataSource.size();
    }
}
