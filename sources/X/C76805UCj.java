package X;

import Y.ACListenerS33S0100000_13;
import Y.ARunnableS16S0100100_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS3S0401000_13;
import Y.ARunnableS49S0100000_13;
import Y.AUListenerS100S0100000_13;
import Y.AUListenerS102S0200000_13;
import Y.IDAListenerS43S0200000_13;
import Y.IDAListenerS80S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusContainerChangeEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchColorEggsUiOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS40S0100100_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UCj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76805UCj extends RelativeLayout implements UD6 {
    public boolean LJLIL;
    public RelativeLayout LJLILLLLZI;
    public ViewGroup LJLJI;
    public LinearLayout LJLJJI;
    public C47061t0 LJLJJL;
    public CMV LJLJJLL;
    public ConstraintLayout LJLJL;
    public ConstraintLayout LJLJLJ;
    public C47061t0 LJLJLLL;
    public CMV LJLL;
    public ProgressBar LJLLI;
    public C47121t6 LJLLILLLL;
    public CardView LJLLJ;
    public C41081jM LJLLL;
    public LinearLayout LJLLLL;
    public CMV LJLLLLLL;
    public C47121t6 LJLZ;
    public View LJZ;
    public FrameLayout LJZI;
    public C2A4 LJZL;
    public boolean LL;
    public DataChannel LLD;
    public C76819UCx LLF;
    public final Handler LLFF;
    public ValueAnimator LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLIL = false;
        ValueAnimator valueAnimator = this.LLFFF;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LLFFF;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = this.LLFFF;
            if (valueAnimator3 != null) {
                valueAnimator3.end();
            }
            this.LLFFF = null;
        }
        C76457TzZ.LIZ(UCK.NONE, 0L, this.LLFII);
        this.LLFF.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    public final void LIZIZ() {
        if (this.LLFII) {
            C2A4 c2a4 = this.LJZL;
            if (c2a4 != null) {
                c2a4.setVisibility(8);
            }
            ConstraintLayout constraintLayout = this.LJLJL;
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, new ACListenerS33S0100000_13(this, 19));
                return;
            }
            return;
        }
        C2A4 c2a42 = this.LJZL;
        if (c2a42 != null) {
            c2a42.setVisibility(0);
        }
        C2A4 c2a43 = this.LJZL;
        if (c2a43 != null) {
            c2a43.LJII();
        }
        ConstraintLayout constraintLayout2 = this.LJLJL;
        if (constraintLayout2 == null) {
            return;
        }
        C16880lQ.LJIL(constraintLayout2, new ACListenerS33S0100000_13(this, 20));
    }

    public final void LIZJ() {
        FrameLayout frameLayout = this.LJZI;
        if (frameLayout != null) {
            int width = frameLayout.getWidth() - C15380j0.LIZ(24.0f);
            float f = -C15380j0.LIZ(67.0f);
            float f2 = width;
            float LIZ = (f2 * 1.0f) + C15380j0.LIZ(67.0f) + C15380j0.LIZ(24.0f);
            if (width == 0) {
                return;
            }
            int LIZ2 = C15380j0.LIZ(12.0f);
            if (CCJ.LIZ(getContext())) {
                f = C15380j0.LIZ(67.0f);
                LIZ = (((-1.0f) * f2) - C15380j0.LIZ(67.0f)) - C15380j0.LIZ(24.0f);
            }
            C76819UCx c76819UCx = this.LLF;
            if (c76819UCx != null) {
                if (c76819UCx.LJLL.compareTo(U2O.TASK_SUCCEED) >= 0) {
                    CardView cardView = this.LJLLJ;
                    if (cardView != null) {
                        C29306Beo.LJJJJLL(LIZ2, cardView);
                    }
                } else {
                    float f3 = 1;
                    C76819UCx c76819UCx2 = this.LLF;
                    if (c76819UCx2 != null) {
                        int LIZ3 = C15380j0.LIZ(12.0f) + ((int) ((f3 - ((((float) c76819UCx2.LJZ) * 1.0f) / ((float) c76819UCx2.LJLZ))) * f2));
                        CardView cardView2 = this.LJLLJ;
                        if (cardView2 != null) {
                            C29306Beo.LJJLIIIJ(C15380j0.LIZ(12.0f), cardView2);
                        }
                        CardView cardView3 = this.LJLLJ;
                        if (cardView3 != null) {
                            C29306Beo.LJJJJL(LIZ3, cardView3);
                        }
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, LIZ);
                this.LLFFF = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setInterpolator(C18950ol.LIZIZ(0.52f, 0.0f, 0.74f, 0.0f));
                }
                ValueAnimator valueAnimator = this.LLFFF;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(1500L);
                }
                ValueAnimator valueAnimator2 = this.LLFFF;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new AUListenerS100S0100000_13(this, 18));
                }
                ValueAnimator valueAnimator3 = this.LLFFF;
                if (valueAnimator3 != null) {
                    valueAnimator3.setRepeatMode(1);
                }
                ValueAnimator valueAnimator4 = this.LLFFF;
                if (valueAnimator4 != null) {
                    valueAnimator4.setRepeatCount(-1);
                }
                ValueAnimator valueAnimator5 = this.LLFFF;
                if (valueAnimator5 != null) {
                    valueAnimator5.start();
                    return;
                }
                return;
            }
            o.LJIJI("presenter");
            throw null;
        }
    }

    public final void LIZLLL() {
        if (!this.LJLIL) {
            return;
        }
        C76819UCx c76819UCx = this.LLF;
        if (c76819UCx != null) {
            if (c76819UCx.LJLL.compareTo(U2O.TASK_IN_PROCESS) >= 0) {
                C76819UCx c76819UCx2 = this.LLF;
                if (c76819UCx2 != null) {
                    if (c76819UCx2.LJLL != U2O.TASK_FAILED) {
                        if (c76819UCx2.LJZ == 0) {
                            CardView cardView = this.LJLLJ;
                            if (cardView != null) {
                                cardView.setVisibility(8);
                            }
                            C41081jM c41081jM = this.LJLLL;
                            if (c41081jM == null) {
                                return;
                            }
                            c41081jM.setVisibility(8);
                            return;
                        }
                        C41081jM c41081jM2 = this.LJLLL;
                        if (c41081jM2 != null) {
                            c41081jM2.setVisibility(0);
                        }
                        CardView cardView2 = this.LJLLJ;
                        if (cardView2 != null) {
                            cardView2.setVisibility(0);
                        }
                        CardView cardView3 = this.LJLLJ;
                        if (cardView3 != null && cardView3.getWidth() == 0) {
                            CardView cardView4 = this.LJLLJ;
                            if (cardView4 == null) {
                                return;
                            }
                            cardView4.post(new ARunnableS49S0100000_13(this, 112));
                            return;
                        }
                        LIZJ();
                        return;
                    }
                } else {
                    o.LJIJI("presenter");
                    throw null;
                }
            }
            ValueAnimator valueAnimator = this.LLFFF;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.LLFFF;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.LLFFF;
                if (valueAnimator3 != null) {
                    valueAnimator3.end();
                }
            }
            CardView cardView5 = this.LJLLJ;
            if (cardView5 != null) {
                cardView5.setVisibility(8);
            }
            C41081jM c41081jM3 = this.LJLLL;
            if (c41081jM3 == null) {
                return;
            }
            c41081jM3.setVisibility(8);
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public final void LJI() {
        DataChannel dataChannel;
        Room room;
        boolean z;
        if (this.LLFII || (dataChannel = this.LLD) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        boolean z2 = false;
        if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ() > 0) {
            z2 = true;
        }
        EnumC31154CKo LIZIZ = C31153CKn.LIZIZ(this.LLFII, z2, z);
        if (LIZIZ == EnumC31154CKo.GREY || LIZIZ == EnumC31154CKo.HIDE) {
            if (room.getRoomAuthStatus() == null || room.getRoomAuthStatus().getRoomAuthOffReasons() == null || room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() == null) {
                return;
            }
            C30868C9o.LJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
            DataChannel dataChannel2 = this.LLD;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.qv0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
            return;
        }
        if (room.getOwner() != null) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLIIZ;
            if (!c48459J0d.LIZJ().booleanValue()) {
                C76819UCx c76819UCx = this.LLF;
                if (c76819UCx != null) {
                    BattlePrompt battlePrompt = c76819UCx.LLFF;
                    if (battlePrompt != null) {
                        String spannableStringBuilder = C76799UCd.LIZIZ(battlePrompt).toString();
                        o.LJIIIIZZ(spannableStringBuilder, "renderBattlePrompt(prese…ckToastPrompt).toString()");
                        if (!TextUtils.isEmpty(spannableStringBuilder)) {
                            C30868C9o.LJI(spannableStringBuilder);
                            c48459J0d.LIZ(Boolean.TRUE);
                        }
                    }
                } else {
                    o.LJIJI("presenter");
                    throw null;
                }
            }
            C32004ChE c32004ChE = new C32004ChE(room.getOwner());
            c32004ChE.LIZIZ = "pk_task";
            HashMap hashMap = new HashMap();
            C76819UCx c76819UCx2 = this.LLF;
            if (c76819UCx2 != null) {
                hashMap.put("pk_task_type", c76819UCx2.LLD);
                C75457TjR.LIZJ(hashMap);
                c32004ChE.LJ = hashMap;
                DataChannel dataChannel3 = this.LLD;
                if (dataChannel3 != null) {
                    dataChannel3.qv0(SendGiftEvent.class, c32004ChE);
                    return;
                }
                return;
            }
            o.LJIJI("presenter");
            throw null;
        }
    }

    public final void LJIIJJI() {
        String LIZIZ;
        C76819UCx c76819UCx = this.LLF;
        if (c76819UCx != null) {
            if (c76819UCx.LJLLLLLL == 0) {
                C47061t0 c47061t0 = this.LJLJLLL;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(8);
                }
                C76819UCx c76819UCx2 = this.LLF;
                if (c76819UCx2 != null) {
                    C76812UCq c76812UCq = new C76812UCq(c76819UCx2.LLIFFJFJJ, null, null);
                    CMV cmv = this.LJLL;
                    LJII(this, c76812UCq, new C76810UCo(null, cmv, cmv, this.LJLJL));
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            }
            CMV cmv2 = this.LJLL;
            if (cmv2 != null) {
                if (CCJ.LIZ(getContext())) {
                    StringBuilder LIZ = X1D.LIZ();
                    C76819UCx c76819UCx3 = this.LLF;
                    if (c76819UCx3 != null) {
                        LIZ.append(c76819UCx3.LJLZ);
                        LIZ.append('/');
                        C76819UCx c76819UCx4 = this.LLF;
                        if (c76819UCx4 != null) {
                            LIZ.append(c76819UCx4.LJZ);
                            LIZIZ = X1D.LIZIZ(LIZ);
                        } else {
                            o.LJIJI("presenter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    C76819UCx c76819UCx5 = this.LLF;
                    if (c76819UCx5 != null) {
                        LIZ2.append(c76819UCx5.LJZ);
                        LIZ2.append('/');
                        C76819UCx c76819UCx6 = this.LLF;
                        if (c76819UCx6 != null) {
                            LIZ2.append(c76819UCx6.LJLZ);
                            LIZIZ = X1D.LIZIZ(LIZ2);
                        } else {
                            o.LJIJI("presenter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
                cmv2.setText(LIZIZ);
            }
            LJIIIIZZ(0, this.LJLJLJ);
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    @Override // X.UD6
    public final void LLIIL() {
        if (this.LJLIL) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.mj6));
        }
    }

    public final BattleTaskGiftAmountGuide getBattleTaskGuideInfo$liveinteract_impl_release() {
        C76819UCx c76819UCx = this.LLF;
        if (c76819UCx != null) {
            return c76819UCx.LLIIJI;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public final int getTaskState() {
        C76819UCx c76819UCx = this.LLF;
        if (c76819UCx != null) {
            int i = U2P.LIZ[c76819UCx.LJLL.ordinal()];
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                if (i != 3) {
                    return -1;
                }
                return 0;
            }
            return 1;
        }
        o.LJIJI("presenter");
        throw null;
    }

    @Override // X.UD6
    public final void O0() {
        ProgressBar progressBar;
        LJIIJJI();
        if (this.LJLIL && (progressBar = this.LJLLI) != null) {
            int progress = progressBar.getProgress();
            C76819UCx c76819UCx = this.LLF;
            if (c76819UCx != null) {
                if (progress != ((int) c76819UCx.LJZ) * 10) {
                    int[] iArr = new int[2];
                    iArr[0] = progressBar.getProgress();
                    C76819UCx c76819UCx2 = this.LLF;
                    if (c76819UCx2 != null) {
                        iArr[1] = ((int) c76819UCx2.LJZ) * 10;
                        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                        ofInt.setDuration(100L);
                        ofInt.addUpdateListener(new AUListenerS102S0200000_13(this, progressBar, 7));
                        ofInt.addListener(new IDAListenerS80S0100000_13(this, 13));
                        ofInt.start();
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL = true;
        this.LJLILLLLZI = (RelativeLayout) findViewById(R.id.j7n);
        this.LJLJI = (ViewGroup) findViewById(R.id.ajn);
        this.LJLJJI = (LinearLayout) findViewById(R.id.g7f);
        this.LJLJJL = (C47061t0) findViewById(R.id.e_g);
        this.LJLJJLL = (CMV) findViewById(R.id.mmy);
        this.LJLJL = (ConstraintLayout) findViewById(R.id.ajm);
        this.LJLJLJ = (ConstraintLayout) findViewById(R.id.buc);
        this.LJLJLLL = (C47061t0) findViewById(R.id.fb5);
        this.LJLL = (CMV) findViewById(R.id.mmx);
        this.LJLLI = (ProgressBar) findViewById(R.id.hjt);
        this.LJLLILLLL = (C47121t6) findViewById(R.id.m3n);
        this.LJLLJ = (CardView) findViewById(R.id.g75);
        this.LJLLL = (C41081jM) findViewById(R.id.nhg);
        this.LJLLLL = (LinearLayout) findViewById(R.id.bcf);
        this.LJLLLLLL = (CMV) findViewById(R.id.m0y);
        this.LJLZ = (C47121t6) findViewById(R.id.m3e);
        this.LJZ = findViewById(R.id.cdg);
        this.LJZI = (FrameLayout) findViewById(R.id.anj);
        this.LJZL = (C2A4) findViewById(R.id.fb1);
    }

    public final boolean getCpcToastShow() {
        return this.LLI;
    }

    public final void LJ(BattleTask battleTask) {
        if (battleTask.battleBonusConfig == null || battleTask.battleBonusStatus == null || !EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("audience init battleTask ");
        LIZ.append(battleTask);
        C0NB.LIZIZ("BattleTaskContainer", X1D.LIZIZ(LIZ));
        RelativeLayout relativeLayout = this.LJLILLLLZI;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.post(new ARunnableS32S0200000_13(battleTask, this, 16));
    }

    public final void LJFF(DataChannel dataChannel) {
        boolean z;
        C2A4 c2a4;
        Boolean bool;
        this.LLD = dataChannel;
        C76819UCx c76819UCx = new C76819UCx(dataChannel);
        this.LLF = c76819UCx;
        c76819UCx.LIZ(this);
        DataChannel dataChannel2 = this.LLD;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LLFII = z;
        if (C76128TuG.LIZIZ(dataChannel, false, 6)) {
            return;
        }
        if (CCJ.LIZ(getContext()) && (c2a4 = this.LJZL) != null) {
            c2a4.setRotation(180.0f);
        }
        if (this.LLFII) {
            C2A4 c2a42 = this.LJZL;
            if (c2a42 == null) {
                return;
            }
            c2a42.setVisibility(8);
            return;
        }
        C2A4 c2a43 = this.LJZL;
        if (c2a43 == null) {
            return;
        }
        c2a43.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_pk_task_arrow.webp"));
    }

    public final void setAnchor(boolean z) {
        this.LLFII = z;
    }

    public final void setCpcToastShow(boolean z) {
        this.LLI = z;
    }

    public final void setMulti(boolean z) {
        this.LLFZ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76805UCj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLFF = new Handler(C16880lQ.LLJJJJ());
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dl9, this, true);
        this.LLIFFJFJJ = true;
    }

    public final void LJIIIIZZ(int i, View view) {
        if (view == null) {
            DataChannel dataChannel = this.LLD;
            if (dataChannel != null) {
                dataChannel.qv0(BattleBonusContainerChangeEvent.class, Integer.valueOf(i));
                return;
            }
            return;
        }
        if (view.getMeasuredWidth() == 0) {
            view.post(new ARunnableS32S0200000_13(this, view, 56));
            return;
        }
        DataChannel dataChannel2 = this.LLD;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.qv0(BattleBonusContainerChangeEvent.class, Integer.valueOf(view.getMeasuredWidth()));
    }

    public final void LJIIIZ(ImageModel imageModel, long j) {
        int i;
        FrameLayout frameLayout = this.LJZI;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout = this.LJLJL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = this.LJLJLJ;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
        ProgressBar progressBar = this.LJLLI;
        if (progressBar != null) {
            C76819UCx c76819UCx = this.LLF;
            if (c76819UCx != null) {
                long j2 = c76819UCx.LJLZ;
                if (j2 > 0) {
                    i = ((int) j2) * 10;
                } else {
                    i = 100;
                }
                progressBar.setMax(i);
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        LJIIJJI();
        C47121t6 c47121t6 = this.LJLLILLLL;
        if (c47121t6 != null) {
            C76819UCx c76819UCx2 = this.LLF;
            if (c76819UCx2 != null) {
                LJIIJ(j - (c76819UCx2.LJLLL - c76819UCx2.LJLLLL), c47121t6);
                if (this.LLIFFJFJJ) {
                    this.LLIFFJFJJ = false;
                    if (imageModel != null) {
                        C47061t0 c47061t0 = this.LJLJLLL;
                        if (c47061t0 != null) {
                            c47061t0.setVisibility(0);
                        }
                        C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(this.LJLJLLL);
                        return;
                    }
                    C47061t0 c47061t02 = this.LJLJLLL;
                    if (c47061t02 == null) {
                        return;
                    }
                    c47061t02.setVisibility(8);
                    return;
                }
                return;
            }
            o.LJIJI("presenter");
            throw null;
        }
    }

    public final void LJIIJ(long j, C47121t6 c47121t6) {
        if (j >= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(j);
            LIZ.append('s');
            c47121t6.setText(X1D.LIZIZ(LIZ));
            return;
        }
        c47121t6.setText("0s");
        if (j >= -2 || this.LLFII) {
            return;
        }
        C76819UCx c76819UCx = this.LLF;
        if (c76819UCx != null) {
            c76819UCx.LJIIIIZZ();
        } else {
            o.LJIJI("presenter");
            throw null;
        }
    }

    @Override // X.UD6
    public final void n0(long j, U2O taskState) {
        Boolean bool;
        int i;
        ViewGroup viewGroup;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        DataChannel dataChannel;
        o.LJIIIZ(taskState, "taskState");
        if (C76128TuG.LIZIZ(this.LLD, false, 6)) {
            RelativeLayout relativeLayout = this.LJLILLLLZI;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.setVisibility(8);
            return;
        }
        if (taskState.compareTo(U2O.DISABLED) > 0) {
            RelativeLayout relativeLayout2 = this.LJLILLLLZI;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            RelativeLayout relativeLayout3 = this.LJLILLLLZI;
            if (relativeLayout3 != null) {
                relativeLayout3.setAlpha(1.0f);
            }
            if (LiveMatchColorEggsUiOpt.INSTANCE.getValue() && (dataChannel = this.LLD) != null) {
                dataChannel.rv0(BattleBonusTaskShowChannel.class, Boolean.TRUE);
            }
        }
        long LIZ = C30725C4b.LIZ();
        switch (U2P.LIZ[taskState.ordinal()]) {
            case 1:
                FrameLayout frameLayout = this.LJZI;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                LinearLayout linearLayout = this.LJLLLL;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                ConstraintLayout constraintLayout = this.LJLJL;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                this.LLIFFJFJJ = true;
                C2A4 c2a4 = this.LJZL;
                if (c2a4 != null) {
                    c2a4.setVisibility(8);
                }
                C44878HjO.LIZJ("eggtask_reward_start, left_time = ", j, "BattleTaskContainer");
                C47121t6 c47121t6 = this.LJLZ;
                if (c47121t6 != null) {
                    C76819UCx c76819UCx = this.LLF;
                    if (c76819UCx != null) {
                        LJIIJ(j - (c76819UCx.LLFFF - c76819UCx.LLFII), c47121t6);
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
                if (!this.LLFII) {
                    FrameLayout frameLayout2 = this.LJZI;
                    if (frameLayout2 != null) {
                        C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS33S0100000_13(this, 21));
                    }
                } else {
                    FrameLayout frameLayout3 = this.LJZI;
                    if (frameLayout3 != null) {
                        C16880lQ.LJIILJJIL(frameLayout3, ViewOnClickListenerC76815UCt.LJLIL);
                    }
                }
                if (!this.LL) {
                    this.LL = true;
                    LinearLayout linearLayout2 = this.LJLLLL;
                    LIZ(linearLayout2, linearLayout2, new AqS163S0100000_13(this, 66));
                    CL6.LIZIZ("match_color_eggs_reward_start");
                    boolean z6 = this.LLFII;
                    JSONObject jSONObject = new JSONObject();
                    C05630Jz.LJFF(jSONObject, "match_left_time", j);
                    if (z6) {
                        U27.LJIILLIIL(jSONObject, "reward_start");
                    } else {
                        U27.LJIIZILJ(jSONObject, "reward_start");
                    }
                    C75832TpU c75832TpU = C75832TpU.LIZ;
                    boolean z7 = this.LLFZ;
                    if (getTranslationY() == 0.0f) {
                        z4 = true;
                        z5 = true;
                    } else {
                        z4 = true;
                        z5 = false;
                    }
                    c75832TpU.LJJIJL(z7, 2, z4 ^ z5, this.LLI);
                }
                UCK uck = UCK.REWARD;
                C76457TzZ.LIZ(uck, LIZ, this.LLFII);
                C76457TzZ.LIZIZ(uck.getValue(), this.LLFII);
                return;
            case 2:
                C2A4 c2a42 = this.LJZL;
                if (c2a42 != null) {
                    if (this.LLFII) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    c2a42.setVisibility(i2);
                }
                this.LLFF.removeCallbacksAndMessages(null);
                this.LL = false;
                AqS40S0100100_13 aqS40S0100100_13 = new AqS40S0100100_13(this, j, 1);
                C76819UCx c76819UCx2 = this.LLF;
                if (c76819UCx2 != null) {
                    ImageModel imageModel = c76819UCx2.LL;
                    ViewGroup viewGroup2 = this.LJLJI;
                    if (viewGroup2 != null && viewGroup2.getVisibility() == 8) {
                        aqS40S0100100_13.invoke();
                    } else {
                        CMV cmv = this.LJLJJLL;
                        if (cmv != null) {
                            cmv.LJJIL();
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                        ofFloat.setDuration(100L);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f, 0.0f);
                        ofFloat2.setDuration(150L);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        LJIIIZ(imageModel, j);
                        ConstraintLayout constraintLayout2 = this.LJLJL;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJLJL, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat3.setDuration(150L);
                        ofFloat3.addListener(new IDAListenerS43S0200000_13(this, aqS40S0100100_13, 5));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playSequentially(animatorSet, ofFloat3);
                        animatorSet2.start();
                    }
                    C44878HjO.LIZJ("eggtask_task_update, left_time = ", j, "BattleTaskContainer");
                    UCK uck2 = UCK.PROGRESS;
                    C76457TzZ.LIZ(uck2, LIZ, this.LLFII);
                    C76457TzZ.LIZIZ(uck2.getValue(), this.LLFII);
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            case 3:
                ViewGroup viewGroup3 = this.LJLJI;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
                FrameLayout frameLayout4 = this.LJZI;
                if (frameLayout4 != null) {
                    frameLayout4.setVisibility(8);
                }
                ConstraintLayout constraintLayout3 = this.LJLJL;
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
                ConstraintLayout constraintLayout4 = this.LJLJLJ;
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(8);
                }
                this.LLIFFJFJJ = true;
                LinearLayout linearLayout3 = this.LJLLLL;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                this.LL = false;
                this.LLII = false;
                ValueAnimator valueAnimator = this.LLFFF;
                if (valueAnimator != null) {
                    bool = Boolean.valueOf(valueAnimator.isRunning());
                } else {
                    bool = null;
                }
                if (!C29306Beo.LJIL(bool)) {
                    ValueAnimator valueAnimator2 = this.LLFFF;
                    if (valueAnimator2 != null) {
                        valueAnimator2.removeAllUpdateListeners();
                    }
                    ValueAnimator valueAnimator3 = this.LLFFF;
                    if (valueAnimator3 != null) {
                        valueAnimator3.end();
                    }
                }
                C76819UCx c76819UCx3 = this.LLF;
                if (c76819UCx3 != null) {
                    List<PreviewPeriod> list = c76819UCx3.LJLLI;
                    if (list.size() != 0) {
                        C76819UCx c76819UCx4 = this.LLF;
                        if (c76819UCx4 != null) {
                            long j2 = c76819UCx4.LJLLILLLL - j;
                            if (list.size() > 1) {
                                int size = list.size();
                                i = 0;
                                for (int i3 = 0; i3 < size && ((PreviewPeriod) ListProtector.get(list, i3)).duration < j2; i3++) {
                                    j2 -= ((PreviewPeriod) ListProtector.get(list, i3)).duration;
                                    i++;
                                }
                            } else {
                                i = 0;
                            }
                            if (((PreviewPeriod) ListProtector.get(list, i)).icon != null) {
                                C47061t0 c47061t0 = this.LJLJJL;
                                if (c47061t0 != null) {
                                    c47061t0.setVisibility(0);
                                }
                                C15650jR.LIZ().LJIIIZ(((PreviewPeriod) ListProtector.get(list, i)).icon).LJIIJJI(this.LJLJJL);
                            } else {
                                C47061t0 c47061t02 = this.LJLJJL;
                                if (c47061t02 != null) {
                                    c47061t02.setVisibility(8);
                                }
                            }
                            LinearLayout linearLayout4 = this.LJLJJI;
                            if (linearLayout4 != null) {
                                linearLayout4.setAlpha(0.0f);
                            }
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJLJI, (Property<ViewGroup, Float>) View.SCALE_Y, 0.0f, 1.0f);
                            ofFloat4.setDuration(150L);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.LJLJJI, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                            AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat5, 100L);
                            LIZLLL.playSequentially(ofFloat4, ofFloat5);
                            LIZLLL.start();
                            SpannableStringBuilder LIZIZ = C76799UCd.LIZIZ(((PreviewPeriod) ListProtector.get(list, i)).promot);
                            CMV cmv2 = this.LJLJJLL;
                            if (cmv2 != null && (viewGroup = this.LJLJI) != null) {
                                cmv2.setText(LIZIZ);
                                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                int LJIIL = C15380j0.LJIIL() - C15380j0.LIZ(156.0f);
                                int measuredWidth = viewGroup.getMeasuredWidth();
                                if (measuredWidth >= LJIIL) {
                                    LJIIL = measuredWidth;
                                }
                                C78866UxK.LJJLJ(LJIIL, viewGroup);
                                if (C15380j0.LJIIL() - C15380j0.LIZ(24.0f) <= LJIIL) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                cmv2.setText(C76799UCd.LIZ(cmv2, LIZIZ, z));
                                LJIIIIZZ(LJIIL, null);
                                if (list.size() > 1 && i != list.size() - 1) {
                                    int size2 = list.size();
                                    long j3 = 0;
                                    for (int i4 = i; i4 < size2; i4++) {
                                        if (i4 == i) {
                                            j3 = (((PreviewPeriod) ListProtector.get(list, i)).duration - j2) * 1000;
                                        } else {
                                            j3 += ((PreviewPeriod) ListProtector.get(list, i4)).duration * 1000;
                                        }
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("noticeDuration = ");
                                        LIZ2.append(j3);
                                        LIZ2.append(" index = ");
                                        LIZ2.append(i4);
                                        C0NB.LIZIZ("BattleTaskContainer", X1D.LIZIZ(LIZ2));
                                        this.LLFF.postDelayed(new ARunnableS3S0401000_13(this, i4, list, viewGroup, cmv2, 0), j3);
                                    }
                                }
                            }
                        } else {
                            o.LJIJI("presenter");
                            throw null;
                        }
                    }
                    boolean z8 = this.LLFII;
                    JSONObject jSONObject2 = new JSONObject();
                    C05630Jz.LJFF(jSONObject2, "match_left_time", j);
                    if (z8) {
                        U27.LJIILLIIL(jSONObject2, "task_preview");
                    } else {
                        U27.LJIIZILJ(jSONObject2, "task_preview");
                    }
                    CL6.LIZIZ("match_color_eggs_guide");
                    C75832TpU c75832TpU2 = C75832TpU.LIZ;
                    boolean z9 = this.LLFZ;
                    if (getTranslationY() == 0.0f) {
                        z2 = true;
                        z3 = true;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    c75832TpU2.LJJIJL(z9, 0, z2 ^ z3, this.LLI);
                    C44878HjO.LIZJ("eggtask_preview, left_time = ", j, "BattleTaskContainer");
                    UCK uck3 = UCK.PREVIEW;
                    C76457TzZ.LIZ(uck3, LIZ, this.LLFII);
                    C76457TzZ.LIZIZ(uck3.getValue(), this.LLFII);
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            case 4:
                RelativeLayout relativeLayout4 = this.LJLILLLLZI;
                if (relativeLayout4 == null || relativeLayout4.getVisibility() != 0) {
                    return;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.LJLILLLLZI, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat6.setDuration(200L);
                ofFloat6.addListener(new IDAListenerS80S0100000_13(this, 2));
                ofFloat6.start();
                return;
            case 5:
                FrameLayout frameLayout5 = this.LJZI;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(0);
                }
                LinearLayout linearLayout5 = this.LJLLLL;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                }
                C47121t6 c47121t62 = this.LJLZ;
                if (c47121t62 != null) {
                    c47121t62.setVisibility(8);
                }
                View view = this.LJZ;
                if (view != null) {
                    view.setVisibility(8);
                }
                LinearLayout linearLayout6 = this.LJLLLL;
                if (linearLayout6 != null) {
                    linearLayout6.setBackgroundResource(R.drawable.cj7);
                }
                CardView cardView = this.LJLLJ;
                if (cardView != null) {
                    cardView.setVisibility(8);
                }
                ValueAnimator valueAnimator4 = this.LLFFF;
                if (valueAnimator4 != null) {
                    valueAnimator4.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator5 = this.LLFFF;
                if (valueAnimator5 != null) {
                    valueAnimator5.end();
                }
                this.LLII = false;
                boolean z10 = this.LLFII;
                C76819UCx c76819UCx5 = this.LLF;
                if (c76819UCx5 != null) {
                    U27.LJIIL(j, c76819UCx5.LJZ, z10);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("eggtask_settle, left_time = ");
                    LIZ3.append(j);
                    LIZ3.append(" , task failed");
                    C0NB.LJIIIZ("BattleTaskContainer", X1D.LIZIZ(LIZ3));
                    LIZ(this.LJLJL, this.LJLLLL, new AqS163S0100000_13(this, 64));
                    LinearLayout linearLayout7 = this.LJLLLL;
                    if (linearLayout7 != null) {
                        linearLayout7.postDelayed(new ARunnableS16S0100100_13(this, j, 0), 3000L);
                    }
                    UCK uck4 = UCK.PROGRESS_RESULT;
                    C76457TzZ.LIZ(uck4, LIZ, this.LLFII);
                    C76457TzZ.LIZIZ(uck4.getValue(), this.LLFII);
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            case 6:
                FrameLayout frameLayout6 = this.LJZI;
                if (frameLayout6 != null) {
                    frameLayout6.setVisibility(0);
                }
                LinearLayout linearLayout8 = this.LJLLLL;
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                C47121t6 c47121t63 = this.LJLZ;
                if (c47121t63 != null) {
                    c47121t63.setVisibility(8);
                }
                View view2 = this.LJZ;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.LL = false;
                this.LLII = false;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("eggtask_task_settle, left_time = ");
                LIZ4.append(j);
                LIZ4.append(" ,task succeed");
                C0NB.LJIIIZ("BattleTaskContainer", X1D.LIZIZ(LIZ4));
                LinearLayout linearLayout9 = this.LJLLLL;
                if (linearLayout9 != null) {
                    linearLayout9.setBackgroundResource(R.drawable.cj6);
                }
                LIZ(this.LJLJL, this.LJLLLL, new AqS163S0100000_13(this, 65));
                LIZLLL();
                LinearLayout linearLayout10 = this.LJLLLL;
                if (linearLayout10 != null) {
                    linearLayout10.postDelayed(new ARunnableS49S0100000_13(this, 38), 3000L);
                }
                UCK uck5 = UCK.PROGRESS_RESULT;
                C76457TzZ.LIZ(uck5, LIZ, this.LLFII);
                C76457TzZ.LIZIZ(uck5.getValue(), this.LLFII);
                return;
            case 7:
                FrameLayout frameLayout7 = this.LJZI;
                if (frameLayout7 != null) {
                    frameLayout7.setVisibility(0);
                }
                LinearLayout linearLayout11 = this.LJLLLL;
                if (linearLayout11 != null) {
                    linearLayout11.setVisibility(0);
                }
                ConstraintLayout constraintLayout5 = this.LJLJLJ;
                if (constraintLayout5 != null) {
                    constraintLayout5.setVisibility(8);
                }
                this.LLIFFJFJJ = true;
                this.LL = false;
                this.LLII = false;
                ValueAnimator valueAnimator6 = this.LLFFF;
                if (valueAnimator6 != null) {
                    valueAnimator6.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator7 = this.LLFFF;
                if (valueAnimator7 != null) {
                    valueAnimator7.end();
                }
                C44878HjO.LIZJ("eggtask_reward_settle, left_time = ", j, "BattleTaskContainer");
                LinearLayout linearLayout12 = this.LJLLLL;
                LIZ(linearLayout12, linearLayout12, new AqS40S0100100_13(this, j, 0));
                U27.LJIIIIZZ(j, this.LLFII);
                UCK uck6 = UCK.REWARD_RESULT;
                C76457TzZ.LIZ(uck6, LIZ, this.LLFII);
                C76457TzZ.LIZIZ(uck6.getValue(), this.LLFII);
                return;
            default:
                return;
        }
    }

    public static void LJII(C76805UCj c76805UCj, C76812UCq c76812UCq, C76810UCo c76810UCo) {
        SpannableStringBuilder spannableStringBuilder;
        float measuredWidth;
        int measuredWidth2;
        boolean z;
        Number valueOf;
        C47061t0 c47061t0;
        if (!c76805UCj.LJLIL) {
            return;
        }
        if ((c76812UCq.LIZ == null && TextUtils.isEmpty(c76812UCq.LIZIZ)) || c76810UCo.LIZJ == null || c76810UCo.LIZLLL == null || c76810UCo.LIZIZ == null) {
            return;
        }
        BattlePrompt battlePrompt = c76812UCq.LIZ;
        if (battlePrompt != null) {
            spannableStringBuilder = C76799UCd.LIZIZ(battlePrompt);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(c76812UCq.LIZIZ);
        }
        if (o.LJ(c76810UCo.LIZIZ.getText().toString(), spannableStringBuilder.toString())) {
            return;
        }
        int LJIIL = C15380j0.LJIIL() - C15380j0.LIZ(24.0f);
        float LIZ = C15380j0.LIZ(100.0f) * 1.0f;
        if (c76810UCo.LIZLLL.getMeasuredWidth() == 0) {
            measuredWidth = LIZ;
        } else {
            measuredWidth = c76810UCo.LIZLLL.getMeasuredWidth() * 1.0f;
        }
        c76810UCo.LIZIZ.setText(spannableStringBuilder);
        if (c76812UCq.LIZJ != null && (c47061t0 = c76810UCo.LIZ) != null) {
            c47061t0.setVisibility(0);
            C15650jR.LIZ().LJIIIZ(c76812UCq.LIZJ).LJIIJJI(c76810UCo.LIZ);
        } else {
            C47061t0 c47061t02 = c76810UCo.LIZ;
            if (c47061t02 != null) {
                c47061t02.setVisibility(8);
            }
        }
        c76810UCo.LIZLLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (o.LJ(c76810UCo.LIZLLL, c76805UCj.LJLJI)) {
            measuredWidth2 = C15380j0.LJIIL() - C15380j0.LIZ(156.0f);
            int measuredWidth3 = c76810UCo.LIZLLL.getMeasuredWidth();
            if (measuredWidth3 >= measuredWidth2) {
                measuredWidth2 = measuredWidth3;
            }
        } else {
            measuredWidth2 = c76810UCo.LIZLLL.getMeasuredWidth();
        }
        if (LJIIL <= measuredWidth2) {
            z = true;
        } else {
            z = false;
        }
        CharSequence text = c76810UCo.LIZIZ.getText();
        o.LJIIIIZZ(text, "views.textView.text");
        if (text.length() == 0) {
            CMV cmv = c76810UCo.LIZIZ;
            cmv.setText(C76799UCd.LIZ(cmv, spannableStringBuilder, z));
            c76805UCj.LJIIIIZZ(0, c76810UCo.LIZLLL);
            return;
        }
        if (measuredWidth2 < LIZ) {
            valueOf = Float.valueOf(LIZ);
        } else {
            valueOf = Integer.valueOf(measuredWidth2);
        }
        int[] iArr = new int[2];
        iArr[0] = (int) measuredWidth;
        if (!z) {
            LJIIL = valueOf.intValue();
        }
        iArr[1] = LJIIL;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new AUListenerS102S0200000_13(c76805UCj, c76810UCo, 6));
        ofInt.addListener(new C76806UCk(c76805UCj, c76810UCo, spannableStringBuilder, z, measuredWidth2));
        c76810UCo.LIZJ.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c76810UCo.LIZJ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, 150L);
        LIZLLL.playSequentially(ofInt, ofFloat);
        LIZLLL.start();
    }

    public final void LIZ(ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this.LJLIL || viewGroup == null || viewGroup2 == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.addListener(new C76809UCn(this, interfaceC65784Pro, viewGroup, viewGroup2));
        if (!o.LJ(viewGroup, viewGroup2)) {
            viewGroup2.setAlpha(0.0f);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat2, 150L);
        LIZLLL.playSequentially(ofFloat, ofFloat2);
        LIZLLL.start();
    }
}
