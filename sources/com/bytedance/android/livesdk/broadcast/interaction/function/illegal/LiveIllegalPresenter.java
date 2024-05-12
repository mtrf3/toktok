package com.bytedance.android.livesdk.broadcast.interaction.function.illegal;

import X.BTJ;
import X.BY9;
import X.BYU;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C1PN;
import X.C276516r;
import X.C28467BFf;
import X.C28718BOw;
import X.C31665Cbl;
import X.C47061t0;
import X.C79077V1t;
import X.CXJ;
import X.InterfaceC92693kP;
import X.Q7L;
import X.TMC;
import X.V8L;
import X.X1D;
import Y.AfS36S0101000_5;
import Y.AfS38S0101000_10;
import Y.IDaS216S0100000_5;
import android.content.Context;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.api.model.WaitingReviewInfo;
import com.bytedance.android.livesdk.api.model.WaitingReviewRule;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class LiveIllegalPresenter extends BY9<BYU> implements WeakHandler.IHandler {
    public static final Spannable EMPTY_SPANNABLE = new SpannableString("");
    public InterfaceC92693kP disposable;
    public String illegalContent;
    public int mCurrentWaitingCount;
    public int mCurrentWaitingTime;
    public String mDialogButtonText;
    public IllegalReviewDialog mIllegalReviewDialog;
    public boolean mIsSmallDialogShow;
    public long mRoomId;
    public String mTemplateCountDown;
    public int mCurrentCountDown = 10;
    public int mReviewStatus = 1;
    public WeakHandler mWeakHandler = new WeakHandler(this);

    public static /* synthetic */ void LJJJJI(LiveIllegalPresenter liveIllegalPresenter, Long l) {
        liveIllegalPresenter.lambda$onMessage$1(l);
    }

    public static /* synthetic */ void LJJJJIZL(LiveIllegalPresenter liveIllegalPresenter, C28467BFf c28467BFf) {
        liveIllegalPresenter.lambda$handleMsg$4(c28467BFf);
    }

    public static /* synthetic */ void LJJJJJ(LiveIllegalPresenter liveIllegalPresenter, C28467BFf c28467BFf) {
        liveIllegalPresenter.lambda$updateReviewInfo$2(c28467BFf);
    }

    public static /* synthetic */ void LJJJJL(LiveIllegalPresenter liveIllegalPresenter, Throwable th) {
        liveIllegalPresenter.lambda$updateReviewInfo$3(th);
    }

    private void updateSmallReviewDialog() {
    }

    public /* synthetic */ void lambda$onMessage$0() {
        T t = this.mView;
        if (t != 0) {
            ((BYU) t).Sd(C15380j0.LJIILJJIL(R.string.ss6), true);
        }
    }

    public boolean isReviewStatusNormal() {
        if (this.mReviewStatus == 1) {
            return true;
        }
        return false;
    }

    public void onIllegalReviewDialogDismiss() {
        if (this.mReviewStatus != 1) {
            this.mIsSmallDialogShow = true;
        }
    }

    public void resetStatusToNormal() {
        this.mWeakHandler.removeMessages(1);
        this.mWeakHandler.removeMessages(2);
        this.mReviewStatus = 1;
        InterfaceC92693kP interfaceC92693kP = this.disposable;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
            this.disposable = null;
        }
        T t = this.mView;
        if (t != 0) {
            ((BYU) t).S8(false);
            this.mIsSmallDialogShow = false;
        }
        IllegalReviewDialog illegalReviewDialog = this.mIllegalReviewDialog;
        if (illegalReviewDialog != null) {
            illegalReviewDialog.dismiss();
        }
    }

    public void submitReview() {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((BYU) t).aa();
        WeakHandler weakHandler = this.mWeakHandler;
        C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).unblockRoom(this.mRoomId)).LJJJLIIL(BTJ.LIZIZ, new AfS36S0101000_5(2, weakHandler, 4));
    }

    public void updateReviewInfo() {
        this.mWeakHandler.removeMessages(2);
        this.mReviewStatus = 3;
        C1EW.LIZ(C28718BOw.LIZ().LIZ().getReviewInfo(this.mRoomId)).LJJJLIIL(new AfS36S0101000_5(0, this, 55), new AfS36S0101000_5(0, this, 56));
    }

    private CharSequence getTitle() {
        return C15380j0.LJIILJJIL(R.string.ss7);
    }

    @Override // X.BY9
    public void detachView() {
        super.detachView();
        this.mWeakHandler.removeMessages(1);
        this.mWeakHandler.removeMessages(2);
    }

    public int getReviewStatus() {
        return this.mReviewStatus;
    }

    private CharSequence getContent(RemindMessage remindMessage) {
        Spannable spannable;
        Spannable spannable2 = EMPTY_SPANNABLE;
        CXJ.LJFF(remindMessage.violationReason, "");
        if (remindMessage.supportDisplayText()) {
            spannable = CXJ.LJFF(remindMessage.baseMessage.displayText, "");
        } else {
            spannable = spannable2;
        }
        if (spannable == spannable2 && !TextUtils.isEmpty(remindMessage.content)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C15380j0.LJIILJJIL(R.string.t1r));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a5n)), 8, spannableStringBuilder.length(), 33);
            spannableStringBuilder.insert(0, (CharSequence) (C15380j0.LJIILJJIL(R.string.sxt) + remindMessage.content + "\n"));
            return spannableStringBuilder;
        }
        return spannable;
    }

    private void handleReviewInfoEvent(WaitingReviewInfo waitingReviewInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        int LIZ;
        int LIZ2;
        this.mCurrentWaitingCount = Math.abs(waitingReviewInfo.getWaitingCount());
        int abs = Math.abs(waitingReviewInfo.getWaitingTime()) / 60;
        this.mCurrentWaitingTime = abs;
        if (abs <= 0) {
            this.mCurrentWaitingTime = abs + 1;
        }
        if (!this.mIsSmallDialogShow) {
            IllegalReviewDialog illegalReviewDialog = this.mIllegalReviewDialog;
            if (!illegalReviewDialog.isViewValid) {
                return;
            }
            illegalReviewDialog.LJLL.setVisibility(8);
            this.mIllegalReviewDialog.LJLJI.setVisibility(0);
            this.mIllegalReviewDialog.LJLJJI.setText(C15380j0.LJIILJJIL(R.string.sye));
            this.mIllegalReviewDialog.LJLJJL.setText(C15380j0.LJIILJJIL(R.string.sxu));
            int i = this.mCurrentWaitingCount;
            if (i <= 5) {
                this.mReviewStatus = 5;
                this.mIllegalReviewDialog.wl(i, this.mCurrentWaitingTime, false);
                IllegalReviewDialog illegalReviewDialog2 = this.mIllegalReviewDialog;
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ss5);
                illegalReviewDialog2.LJLJLJ.setVisibility(0);
                illegalReviewDialog2.LJLJLJ.setText(LJIILJJIL);
            } else {
                this.mReviewStatus = 4;
                this.mIllegalReviewDialog.wl(i, this.mCurrentWaitingTime, true);
                this.mIllegalReviewDialog.LJLJLJ.setVisibility(8);
            }
            List<WaitingReviewRule> waitingReviewRules = waitingReviewInfo.getWaitingReviewRules();
            if (waitingReviewRules == null || waitingReviewRules.isEmpty()) {
                return;
            }
            IllegalReviewDialog illegalReviewDialog3 = this.mIllegalReviewDialog;
            illegalReviewDialog3.getClass();
            if (waitingReviewRules.isEmpty()) {
                return;
            }
            illegalReviewDialog3.LJLJLLL.setVisibility(0);
            illegalReviewDialog3.LJLLI = waitingReviewRules;
            if (illegalReviewDialog3.LJLJLLL.getChildCount() == illegalReviewDialog3.LJLLI.size()) {
                z = true;
            } else {
                z = false;
                illegalReviewDialog3.LJLJLLL.removeAllViews();
            }
            for (int i2 = 0; i2 < waitingReviewRules.size(); i2++) {
                WaitingReviewRule waitingReviewRule = (WaitingReviewRule) ListProtector.get(waitingReviewRules, i2);
                if (waitingReviewRule != null && !TextUtils.isEmpty(waitingReviewRule.backgroundUrl)) {
                    String str = waitingReviewRule.backgroundUrl;
                    if (!z) {
                        C47061t0 c47061t0 = new C47061t0(illegalReviewDialog3.LJLIL);
                        c47061t0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        V8L LIZIZ = V8L.LIZIZ(C15380j0.LIZ(4.0f));
                        C79077V1t c79077V1t = new C79077V1t(C15380j0.LJIIJ());
                        c79077V1t.LJIILL = LIZIZ;
                        c47061t0.setHierarchy(c79077V1t.LIZ());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        layoutParams.weight = 1.0f;
                        if (i2 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 == illegalReviewDialog3.LJLLI.size() - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            LIZ = 0;
                        } else {
                            LIZ = C15380j0.LIZ(4.25f);
                        }
                        if (z3) {
                            LIZ2 = 0;
                        } else {
                            LIZ2 = C15380j0.LIZ(4.25f);
                        }
                        layoutParams.setMargins(LIZ, 0, LIZ2, 0);
                        c47061t0.setLayoutParams(layoutParams);
                        C16880lQ.LJJI(c47061t0, illegalReviewDialog3);
                        c47061t0.setTag(Integer.valueOf(i2));
                        C31665Cbl.LJI(c47061t0, str);
                        illegalReviewDialog3.LJLJLLL.addView(c47061t0);
                    } else {
                        C47061t0 c47061t02 = (C47061t0) illegalReviewDialog3.LJLJLLL.getChildAt(i2);
                        if (c47061t02 != null) {
                            C31665Cbl.LJI(c47061t02, str);
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ void lambda$handleMsg$4(C28467BFf c28467BFf) {
        WeakHandler weakHandler = this.mWeakHandler;
        if (weakHandler != null) {
            Message obtainMessage = weakHandler.obtainMessage(34);
            obtainMessage.obj = c28467BFf.data;
            this.mWeakHandler.sendMessage(obtainMessage);
        }
    }

    public /* synthetic */ void lambda$handleMsg$5(Throwable th) {
        WeakHandler weakHandler = this.mWeakHandler;
        if (weakHandler != null) {
            Message obtainMessage = weakHandler.obtainMessage(34);
            obtainMessage.obj = th;
            this.mWeakHandler.sendMessage(obtainMessage);
        }
    }

    public void lambda$onMessage$1(Long l) {
        if (this.mView != 0) {
            ((BYU) this.mView).Sd(C16880lQ.LLLZI(Locale.getDefault(), this.mTemplateCountDown, new Object[]{Long.valueOf((10 - l.longValue()) - 1)}), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$updateReviewInfo$2(C28467BFf c28467BFf) {
        handleReviewInfoEvent((WaitingReviewInfo) c28467BFf.data);
    }

    public /* synthetic */ void lambda$updateReviewInfo$3(Throwable th) {
        this.mWeakHandler.sendEmptyMessageDelayed(2, 10000L);
    }

    private void onDeblockMosaic(Object obj) {
        if ((obj instanceof C276516r) && this.mView != 0) {
            resetStatusToNormal();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        T t = this.mView;
        if (t == 0 || this.mReviewStatus == 1) {
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 25) {
                    return;
                }
                onDeblockMosaic(message.obj);
                return;
            }
            C1EW.LIZ(C28718BOw.LIZ().LIZ().getReviewInfo(this.mRoomId)).LJJJLIIL(new AfS38S0101000_10(0, this, 1), new C1PN(1, this));
            return;
        }
        ((BYU) t).jd();
    }

    public void onMessage(RemindMessage remindMessage) {
        T t = this.mView;
        if (t == 0 || remindMessage == null) {
            return;
        }
        int i = remindMessage.noticeType;
        if (2 == i) {
            if (this.mReviewStatus != 1) {
                return;
            }
            this.mReviewStatus = 2;
            this.mCurrentCountDown = 10;
            this.illegalContent = remindMessage.content;
            ((BYU) t).kg(getTitle());
            ((BYU) this.mView).s5(getContent(remindMessage));
            String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), this.mTemplateCountDown, new Object[]{Integer.valueOf(this.mCurrentCountDown)});
            ((BYU) this.mView).n0();
            ((BYU) this.mView).Sd(LLLZI, false);
            ((BYU) this.mView).S8(true);
            this.mWeakHandler.sendEmptyMessageDelayed(1, 600000L);
            InterfaceC92693kP interfaceC92693kP = this.disposable;
            if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
                return;
            }
            this.disposable = C1EW.LIZ(TMC.LJJIFFI(10L, 1000L, 1000L, TimeUnit.MILLISECONDS)).LJIIZILJ(new IDaS216S0100000_5(this, 6)).LJJJJZI(new AfS36S0101000_5(0, this, 54));
            return;
        }
        if (3 != i || this.mReviewStatus == 1) {
            return;
        }
        ((BYU) t).Xe();
        resetStatusToNormal();
    }

    public void setIllegalDialogFragment(IllegalReviewDialog illegalReviewDialog) {
        this.mIllegalReviewDialog = illegalReviewDialog;
    }

    public LiveIllegalPresenter(long j, Context context) {
        this.mRoomId = j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C15380j0.LJIILJJIL(R.string.ss6));
        LIZ.append("（%ds）");
        this.mTemplateCountDown = X1D.LIZIZ(LIZ);
    }
}
