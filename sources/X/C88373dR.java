package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3dR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88373dR extends AbstractC1048549p<ShareUserContent> {
    public String LLILLIZIL;
    public final EventLiveData<RelationStatus> LLILLJJLI;
    public final C62822Ol8 LLILLL;
    public final C62822Ol8 LLILZ;
    public boolean LLILZIL;
    public final C62822Ol8 LLILZLL;
    public final C62822Ol8 LLIZ;

    @Override // X.AbstractC1041546x
    public final void LJJJJIZL() {
        super.LJJJJIZL();
        this.LLILLJJLI.removeObserver((Observer) this.LLILZ.getValue());
    }

    public static boolean x0(IMUser iMUser) {
        if (iMUser == null || iMUser.getFollowStatus() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass460, X.AbstractC1041546x
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        C16880lQ.LJJJJI(this.LLILL, onClickListener);
    }

    public final void z0(boolean z) {
        int i;
        int i2;
        View view = this.LLIL;
        if (view != null) {
            int i3 = 0;
            if (z) {
                if (view.getVisibility() != 0) {
                    return;
                } else {
                    i = 62;
                }
            } else if (this.LLIL.getVisibility() != 8) {
                return;
            } else {
                i = 40;
            }
            int LIZIZ = C7MY.LIZIZ(i);
            AnonymousClass636.LJIIZILJ(this.LLIL, Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ));
            AnonymousClass636.LJIIZILJ(this.LLILIL, Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ));
            ViewGroup.LayoutParams layoutParams = this.LLIL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                i2 = C7MY.LIZIZ(16);
            } else {
                i2 = 0;
            }
            marginLayoutParams.setMarginEnd(i2);
            this.LLIL.setLayoutParams(marginLayoutParams);
            if (z) {
                C78765Uvh.LIZ(this.LLILIL, R.drawable.bia);
                View[] viewArr = {this.LLIIJI, this.LLILL, this.LLIIZ};
                do {
                    viewArr[i3].setVisibility(8);
                    i3++;
                } while (i3 < 3);
                return;
            }
            this.LLIIJI.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88373dR(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLILLJJLI = C77266UUc.LIZIZ.getRelationService().LJFF();
        this.LLILLL = C221108m2.LIZIZ(C3AN.LJLIL);
        this.LLILZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 807));
        this.LLILZLL = C221108m2.LIZIZ(C794339v.LJLIL);
        this.LLIZ = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 806));
    }

    @Override // X.AnonymousClass460
    public final void p0(final C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
        final ShareUserContent shareUserContent = (ShareUserContent) baseContent;
        o.LJIIIZ(msg, "msg");
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 21);
        }
        this.LLILL.setTag(50331648, 5);
        this.LLILL.setTag(134217728, msg);
        if (shareUserContent == null) {
            return;
        }
        this.LLILLIZIL = shareUserContent.getUid();
        IMUser LJFF = C80533Eb.LJFF(shareUserContent.getUid(), shareUserContent.getSecUid());
        final boolean z = false;
        z0(false);
        C80533Eb.LIZ.getClass();
        if (!ORZ.LJLJJI(shareUserContent.getUid(), C80533Eb.LIZJ()) || this.LLILZIL) {
            z = true;
        }
        if (LJFF == null || z) {
            if (!this.LLILZIL) {
                if (LJFF != null) {
                    w0(shareUserContent, LJFF.getNickName(), LJFF.getUniqueId(), LJFF.getAvatarThumb(), LJFF.isBlocked(), x0(LJFF));
                } else {
                    w0(shareUserContent, shareUserContent.getName(), shareUserContent.getDesc(), shareUserContent.getAvatar(), false, x0(LJFF));
                }
            }
            C80533Eb.LJIIJJI(shareUserContent.getUid(), shareUserContent.getSecUid(), z, new C3EU(msg, shareUserContent, z) { // from class: X.3Qi
                public final /* synthetic */ ShareUserContent LIZIZ;
                public final /* synthetic */ boolean LIZJ;

                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    String uniqueId;
                    o.LJIIIZ(result, "result");
                    C88373dR c88373dR = C88373dR.this;
                    ShareUserContent shareUserContent2 = this.LIZIZ;
                    String nickName = result.getNickName();
                    if (result.isBlocked()) {
                        uniqueId = null;
                    } else {
                        uniqueId = result.getUniqueId();
                    }
                    UrlModel avatarThumb = result.getAvatarThumb();
                    boolean isBlocked = result.isBlocked();
                    C88373dR.this.getClass();
                    c88373dR.w0(shareUserContent2, nickName, uniqueId, avatarThumb, isBlocked, C88373dR.x0(result));
                    if (this.LIZJ) {
                        C80533Eb.LIZ.getClass();
                        java.util.Set LIZJ = C80533Eb.LIZJ();
                        String uid = result.getUid();
                        o.LJIIIIZZ(uid, "result.uid");
                        LIZJ.add(uid);
                    }
                    C88373dR.this.LLILZIL = false;
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                }

                {
                    this.LIZIZ = shareUserContent;
                    this.LIZJ = z;
                }
            });
        } else {
            w0(shareUserContent, LJFF.getNickName(), LJFF.getUniqueId(), LJFF.getAvatarThumb(), LJFF.isBlocked(), x0(LJFF));
        }
        this.LLILLJJLI.observeForever((Observer) this.LLILZ.getValue());
    }

    public final void w0(ShareUserContent shareUserContent, String str, String str2, UrlModel urlModel, boolean z, boolean z2) {
        C76800UCe c76800UCe;
        this.LLIILZL.setText(str);
        if (!z) {
            if (str2 != null) {
                this.LLIIZ.setVisibility(0);
                TuxTextView tuxTextView = this.LLIIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('@');
                LIZ.append(str2);
                tuxTextView.setText(X1D.LIZIZ(LIZ));
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            if (c76800UCe == null) {
                this.LLIIZ.setVisibility(8);
            }
            if (urlModel != null) {
                String uid = shareUserContent.getUid();
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
                    LJII.LJIILIIL = (Drawable) this.LLIZ.getValue();
                    LJII.LJIILLIIL = (Drawable) this.LLIZ.getValue();
                } else {
                    LJII.LJIIJJI = R.drawable.bia;
                    LJII.LJIILL = R.drawable.bia;
                }
                LJII.LJIJJLI = C43659HBn.LJIIL();
                LJII.LJJIII = EnumC62195Ob1.SMALL;
                LJII.LJJIIJZLJL = this.LLILIL;
                C43659HBn.LJIIZILJ(LJII, "ShareUserMultipleReceiveViewHolder", uid, 0, null, 28);
                if (C76800UCe.LIZ == null) {
                    C78765Uvh.LIZ(this.LLILIL, R.drawable.bia);
                }
            }
            t0("ShareUserMultiReceiveViewHolder", shareUserContent.getAwemeCoverList(), s0().LIZ);
            if (z2) {
                this.LLILL.setVisibility(8);
                return;
            } else {
                this.LLILL.setVisibility(0);
                return;
            }
        }
        z0(true);
    }
}
