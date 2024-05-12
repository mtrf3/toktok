package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.api.CommentPinAPI;
import com.ss.android.ugc.aweme.comment.event.PinNotice;
import com.ss.android.ugc.aweme.comment.event.PinResult;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6vR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175976vR implements InterfaceC174316sl {
    public static C175466uc LJ;
    public static C175466uc LJFF;
    public C76S LIZ;
    public TuxIconView LIZIZ;
    public C175466uc LIZJ;
    public Comment LIZLLL;

    public final Comment LIZIZ() {
        Comment comment = this.LIZLLL;
        if (comment != null) {
            return comment;
        }
        o.LJIJI("comment");
        throw null;
    }

    public final C175466uc LIZJ() {
        C175466uc c175466uc = this.LIZJ;
        if (c175466uc != null) {
            return c175466uc;
        }
        o.LJIJI("singlePinStatus");
        throw null;
    }

    public final C76S LIZLLL() {
        C76S c76s = this.LIZ;
        if (c76s != null) {
            return c76s;
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final void LJ(boolean z) {
        int i;
        TuxIconView tuxIconView = this.LIZIZ;
        if (tuxIconView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
            return;
        }
        o.LJIJI("pinCommentView");
        throw null;
    }

    public final void LJFF(boolean z) {
        if (z) {
            LIZLLL().setDefaultLoadingText(LIZLLL().getContext().getString(R.string.dl3));
        } else {
            LIZLLL().setDefaultLoadingText(LIZLLL().getContext().getString(R.string.dmg));
        }
        LIZLLL().setLoading(true);
    }

    public final MutableLiveData<C175436uZ> LIZ(final boolean z, boolean z2) {
        int i;
        final MutableLiveData<C175436uZ> mutableLiveData = new MutableLiveData<>();
        CommentPinAPI commentPinAPI = C1808878a.LIZ;
        String awemeId = LIZIZ().getAwemeId();
        o.LJIIIIZZ(awemeId, "comment.awemeId");
        String cid = LIZIZ().getCid();
        o.LJIIIIZZ(cid, "comment.cid");
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        commentPinAPI.pinComment(awemeId, cid, currentTimeMillis, i, z2).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new InterfaceC73463SsN<PinResult>() { // from class: X.6ub
            @Override // X.InterfaceC73463SsN
            public final void onError(Throwable e) {
                C38306F1q c38306F1q;
                PinResult pinResult;
                o.LJIIIZ(e, "e");
                PinNotice pinNotice = null;
                if ((e instanceof C38333F2r) && (c38306F1q = (C38306F1q) e) != null && c38306F1q.getErrorCode() == 3008034) {
                    C175466uc LIZJ = C175976vR.this.LIZJ();
                    EnumC177716yF enumC177716yF = EnumC177716yF.LIMIT;
                    Object rawResponse = ((C38333F2r) e).getRawResponse();
                    if ((rawResponse instanceof PinResult) && (pinResult = (PinResult) rawResponse) != null) {
                        pinNotice = pinResult.notice;
                    }
                    LIZJ.LIZ(new C175436uZ(enumC177716yF, pinNotice));
                    return;
                }
                C175976vR.this.LIZJ().LIZ(new C175436uZ(EnumC177716yF.FAIL, null));
            }

            @Override // X.InterfaceC73463SsN
            public final void onSubscribe(InterfaceC92693kP d) {
                o.LJIIIZ(d, "d");
                C175466uc LIZJ = C175976vR.this.LIZJ();
                MutableLiveData<C175436uZ> mutableLiveData2 = mutableLiveData;
                LIZJ.LIZ = d;
                LIZJ.LIZIZ = mutableLiveData2;
                LIZJ.LIZJ = true;
                boolean z3 = z;
                C175466uc LIZJ2 = C175976vR.this.LIZJ();
                if (z3) {
                    if (o.LJ(C175976vR.LJ, LIZJ2)) {
                        return;
                    }
                    C175466uc c175466uc = C175976vR.LJ;
                    if (c175466uc != null) {
                        c175466uc.LIZ(new C175436uZ(EnumC177716yF.CANCEL, null));
                    }
                    C175976vR.LJ = LIZJ2;
                    return;
                }
                if (o.LJ(C175976vR.LJFF, LIZJ2)) {
                    return;
                }
                C175466uc c175466uc2 = C175976vR.LJFF;
                if (c175466uc2 != null) {
                    c175466uc2.LIZ(new C175436uZ(EnumC177716yF.CANCEL, null));
                }
                C175976vR.LJFF = LIZJ2;
            }

            @Override // X.InterfaceC73463SsN
            public final void onSuccess(PinResult pinResult) {
                PinResult t = pinResult;
                o.LJIIIZ(t, "t");
                int i2 = t.status_code;
                if (i2 == 0) {
                    C175976vR.this.LIZJ().LIZ(new C175436uZ(EnumC177716yF.SUCCESS, null));
                } else if (i2 == 3008034) {
                    C175976vR.this.LIZJ().LIZ(new C175436uZ(EnumC177716yF.LIMIT, t.notice));
                } else {
                    onError(new Exception("response status_code != 0"));
                }
            }
        });
        return mutableLiveData;
    }
}
