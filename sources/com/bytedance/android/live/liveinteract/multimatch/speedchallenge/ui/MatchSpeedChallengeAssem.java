package com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui;

import X.C05630Jz;
import X.C06460Ne;
import X.C0NB;
import X.C0RN;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C18950ol;
import X.C212428Vi;
import X.C29306Beo;
import X.C2K0;
import X.C30725C4b;
import X.C30868C9o;
import X.C31153CKn;
import X.C32004ChE;
import X.C41081jM;
import X.C44878HjO;
import X.C47061t0;
import X.C47121t6;
import X.C47704Ins;
import X.C48459J0d;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C74039T3z;
import X.C75457TjR;
import X.C75832TpU;
import X.C76457TzZ;
import X.C76799UCd;
import X.C76807UCl;
import X.C76813UCr;
import X.C76814UCs;
import X.C76819UCx;
import X.C78866UxK;
import X.CCJ;
import X.CL6;
import X.CMV;
import X.CN1;
import X.EnumC31154CKo;
import X.InterfaceC30442Bx8;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.JBR;
import X.U27;
import X.U2O;
import X.U2Q;
import X.U5I;
import X.UCK;
import X.UD6;
import X.ViewOnClickListenerC76816UCu;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS16S0100100_13;
import Y.ARunnableS3S0401000_13;
import Y.ARunnableS49S0100000_13;
import Y.AUListenerS100S0100000_13;
import Y.AUListenerS102S0200000_13;
import Y.IDAListenerS43S0200000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS40S0100100_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MatchSpeedChallengeAssem extends UISlotAssem implements ISpeedChallengeAbility, UD6, InterfaceC55102Lju {
    public boolean LJLL;
    public RelativeLayout LJLLI;
    public ViewGroup LJLLILLLL;
    public LinearLayout LJLLJ;
    public C47061t0 LJLLL;
    public U5I LJLLLL;
    public LiveIconView LJLLLLLL;
    public ConstraintLayout LJLZ;
    public ConstraintLayout LJZ;
    public C47061t0 LJZI;
    public CMV LJZL;
    public ProgressBar LL;
    public C47121t6 LLD;
    public FrameLayout LLF;
    public C41081jM LLFF;
    public LinearLayout LLFFF;
    public CMV LLFII;
    public C47121t6 LLFZ;
    public View LLI;
    public FrameLayout LLIFFJFJJ;
    public ImageView LLII;
    public boolean LLIIII;
    public DataChannel LLIIIILZ;
    public ValueAnimator LLIIIL;
    public boolean LLIIIZ;
    public C76819UCx LLIIJI;
    public boolean LLIIL;
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C74039T3z.class, null), checkSupervisorPrepared());
    public final Handler LLIIIJ = new Handler(C16880lQ.LLJJJJ());
    public boolean LLIIJLIL = true;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        this.LJLL = false;
        ValueAnimator valueAnimator = this.LLIIIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LLIIIL;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = this.LLIIIL;
            if (valueAnimator3 != null) {
                valueAnimator3.end();
            }
            this.LLIIIL = null;
        }
        C76457TzZ.LIZ(UCK.NONE, 0L, this.LLIIIZ);
        this.LLIIIJ.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1199155498) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.dla;
    }

    public final void H3() {
        InterfaceC55235Lm3 LJIIZILJ;
        C0NB.LJ("SpeedChallengeAssem", "bind Ability");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LJIIZILJ = C55230Lly.LIZJ(LIZLLL, null);
        } else {
            LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIIL(LJIIZILJ, this, ISpeedChallengeAbility.class, null, this);
    }

    public final void I3() {
        if (this.LLIIIZ) {
            ImageView imageView = this.LLII;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ConstraintLayout constraintLayout = this.LJLZ;
            if (constraintLayout != null) {
                C16880lQ.LJIL(constraintLayout, new ACListenerS33S0100000_13(this, 54));
                return;
            }
            return;
        }
        ImageView imageView2 = this.LLII;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = this.LJLZ;
        if (constraintLayout2 == null) {
            return;
        }
        C16880lQ.LJIL(constraintLayout2, new ACListenerS33S0100000_13(this, 55));
    }

    public final void K3() {
        FrameLayout frameLayout = this.LLIFFJFJJ;
        if (frameLayout != null) {
            int width = frameLayout.getWidth();
            float f = -C15380j0.LIZ(67.0f);
            float f2 = width;
            float LIZ = (f2 * 1.0f) + C15380j0.LIZ(67.0f) + C15380j0.LIZ(16.0f);
            if (width == 0) {
                return;
            }
            C15380j0.LIZ(8.0f);
            if (CCJ.LIZ(getContext())) {
                f = C15380j0.LIZ(67.0f);
                LIZ = (((-1.0f) * f2) - C15380j0.LIZ(67.0f)) - C15380j0.LIZ(16.0f);
            }
            C76819UCx c76819UCx = this.LLIIJI;
            if (c76819UCx != null) {
                if (c76819UCx.LJLL.compareTo(U2O.TASK_SUCCEED) >= 0) {
                    FrameLayout frameLayout2 = this.LLF;
                    if (frameLayout2 != null) {
                        C29306Beo.LJJJJLL(C15380j0.LIZ(2.0f), frameLayout2);
                    }
                } else {
                    float f3 = 1;
                    C76819UCx c76819UCx2 = this.LLIIJI;
                    if (c76819UCx2 != null) {
                        int i = (int) ((f3 - ((((float) c76819UCx2.LJZ) * 1.0f) / ((float) c76819UCx2.LJLZ))) * f2);
                        FrameLayout frameLayout3 = this.LLF;
                        if (frameLayout3 != null) {
                            C29306Beo.LJJLIIIJ(C15380j0.LIZ(2.0f), frameLayout3);
                        }
                        FrameLayout frameLayout4 = this.LLF;
                        if (frameLayout4 != null) {
                            C29306Beo.LJJJJL(i, frameLayout4);
                        }
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, LIZ);
                this.LLIIIL = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setInterpolator(C18950ol.LIZIZ(0.52f, 0.0f, 0.74f, 0.0f));
                }
                ValueAnimator valueAnimator = this.LLIIIL;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(1500L);
                }
                ValueAnimator valueAnimator2 = this.LLIIIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new AUListenerS100S0100000_13(this, 47));
                }
                ValueAnimator valueAnimator3 = this.LLIIIL;
                if (valueAnimator3 != null) {
                    valueAnimator3.setRepeatMode(1);
                }
                ValueAnimator valueAnimator4 = this.LLIIIL;
                if (valueAnimator4 != null) {
                    valueAnimator4.setRepeatCount(-1);
                }
                ValueAnimator valueAnimator5 = this.LLIIIL;
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

    public final void L3() {
        if (!this.LJLL) {
            return;
        }
        C76819UCx c76819UCx = this.LLIIJI;
        if (c76819UCx != null) {
            U2O u2o = c76819UCx.LJLL;
            if ((u2o == U2O.TASK_IN_PROCESS || u2o == U2O.TASK_SUCCEED) && u2o != U2O.TASK_FAILED) {
                if (c76819UCx.LJZ == 0) {
                    FrameLayout frameLayout = this.LLF;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    C41081jM c41081jM = this.LLFF;
                    if (c41081jM == null) {
                        return;
                    }
                    c41081jM.setVisibility(8);
                    return;
                }
                C41081jM c41081jM2 = this.LLFF;
                if (c41081jM2 != null) {
                    c41081jM2.setVisibility(0);
                }
                FrameLayout frameLayout2 = this.LLF;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                FrameLayout frameLayout3 = this.LLF;
                if (frameLayout3 != null && frameLayout3.getWidth() == 0) {
                    FrameLayout frameLayout4 = this.LLF;
                    if (frameLayout4 == null) {
                        return;
                    }
                    frameLayout4.post(new ARunnableS49S0100000_13(this, 177));
                    return;
                }
                K3();
                return;
            }
            ValueAnimator valueAnimator = this.LLIIIL;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.LLIIIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.LLIIIL;
                if (valueAnimator3 != null) {
                    valueAnimator3.end();
                }
            }
            FrameLayout frameLayout5 = this.LLF;
            if (frameLayout5 != null) {
                frameLayout5.setVisibility(8);
            }
            C41081jM c41081jM3 = this.LLFF;
            if (c41081jM3 == null) {
                return;
            }
            c41081jM3.setVisibility(8);
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    @Override // X.UD6
    public final void LLIIL() {
        if (this.LJLL) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.mj6));
        }
    }

    public final void M3() {
        DataChannel dataChannel;
        Room room;
        boolean z;
        if (this.LLIIIZ || (dataChannel = this.LLIIIILZ) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
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
        EnumC31154CKo LIZIZ = C31153CKn.LIZIZ(this.LLIIIZ, z2, z);
        if (LIZIZ == EnumC31154CKo.GREY || LIZIZ == EnumC31154CKo.HIDE) {
            if (room.getRoomAuthStatus() == null || room.getRoomAuthStatus().getRoomAuthOffReasons() == null || room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() == null) {
                return;
            }
            C30868C9o.LJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
            DataChannel dataChannel2 = this.LLIIIILZ;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.qv0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
            return;
        }
        if (room.getOwner() != null) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLIIZ;
            if (!c48459J0d.LIZJ().booleanValue()) {
                C76819UCx c76819UCx = this.LLIIJI;
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
            C76819UCx c76819UCx2 = this.LLIIJI;
            if (c76819UCx2 != null) {
                hashMap.put("pk_task_type", c76819UCx2.LLD);
                C75457TjR.LIZJ(hashMap);
                c32004ChE.LJ = hashMap;
                DataChannel dataChannel3 = this.LLIIIILZ;
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

    public final void R3() {
        boolean z;
        float LIZ;
        TextPaint paint;
        String sb;
        C76819UCx c76819UCx = this.LLIIJI;
        if (c76819UCx != null) {
            if (c76819UCx.LJLLLLLL == 0) {
                C47061t0 c47061t0 = this.LJZI;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(8);
                }
                C76819UCx c76819UCx2 = this.LLIIJI;
                if (c76819UCx2 != null) {
                    C76814UCs c76814UCs = new C76814UCs(c76819UCx2.LLIFFJFJJ, null);
                    CMV cmv = this.LJZL;
                    O3(c76814UCs, new C76813UCr(cmv, cmv, this.LJLZ));
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            }
            long j = c76819UCx.LJLZ;
            if (0 <= j && j < 100) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CMV cmv2 = this.LJZL;
                if (cmv2 != null) {
                    cmv2.setWidth(C15380j0.LIZ(36.0f));
                }
            } else if (j >= 100) {
                CMV cmv3 = this.LJZL;
                if (cmv3 != null && (paint = cmv3.getPaint()) != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    C76819UCx c76819UCx3 = this.LLIIJI;
                    if (c76819UCx3 != null) {
                        LIZ2.append(c76819UCx3.LJLZ);
                        LIZ2.append('/');
                        C76819UCx c76819UCx4 = this.LLIIJI;
                        if (c76819UCx4 != null) {
                            LIZ2.append(c76819UCx4.LJLZ);
                            LIZ = paint.measureText(X1D.LIZIZ(LIZ2));
                        } else {
                            o.LJIJI("presenter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                } else {
                    LIZ = C15380j0.LIZ(50.0f);
                }
                CMV cmv4 = this.LJZL;
                if (cmv4 != null) {
                    cmv4.setWidth(C29306Beo.LJJLIIJ(LIZ));
                }
            }
            CMV cmv5 = this.LJZL;
            if (cmv5 == null) {
                return;
            }
            if (CCJ.LIZ(getContext())) {
                StringBuilder sb2 = new StringBuilder();
                C76819UCx c76819UCx5 = this.LLIIJI;
                if (c76819UCx5 != null) {
                    sb2.append(c76819UCx5.LJLZ);
                    sb2.append('/');
                    C76819UCx c76819UCx6 = this.LLIIJI;
                    if (c76819UCx6 != null) {
                        sb2.append(c76819UCx6.LJZ);
                        sb = sb2.toString();
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                } else {
                    o.LJIJI("presenter");
                    throw null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                C76819UCx c76819UCx7 = this.LLIIJI;
                if (c76819UCx7 != null) {
                    sb3.append(c76819UCx7.LJZ);
                    sb3.append('/');
                    C76819UCx c76819UCx8 = this.LLIIJI;
                    if (c76819UCx8 != null) {
                        sb3.append(c76819UCx8.LJLZ);
                        sb = sb3.toString();
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                } else {
                    o.LJIJI("presenter");
                    throw null;
                }
            }
            cmv5.setText(sb);
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.ISpeedChallengeAbility
    public final BattleTaskGiftAmountGuide g60() {
        C76819UCx c76819UCx = this.LLIIJI;
        if (c76819UCx != null) {
            return c76819UCx.LLIIJI;
        }
        o.LJIJI("presenter");
        throw null;
    }

    @Override // X.UD6
    public final void O0() {
        R3();
        if (this.LJLL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("taskProgressBar currentProgress= ");
            C76819UCx c76819UCx = this.LLIIJI;
            if (c76819UCx != null) {
                LIZ.append(c76819UCx.LJZ);
                C0NB.LIZIZ("SpeedChallengeAssem", X1D.LIZIZ(LIZ));
                ProgressBar progressBar = this.LL;
                if (progressBar != null) {
                    int progress = progressBar.getProgress();
                    C76819UCx c76819UCx2 = this.LLIIJI;
                    if (c76819UCx2 != null) {
                        if (progress != ((int) c76819UCx2.LJZ) * 10) {
                            int[] iArr = new int[2];
                            iArr[0] = progressBar.getProgress();
                            C76819UCx c76819UCx3 = this.LLIIJI;
                            if (c76819UCx3 != null) {
                                iArr[1] = ((int) c76819UCx3.LJZ) * 10;
                                ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                                ofInt.setDuration(100L);
                                ofInt.addUpdateListener(new AUListenerS102S0200000_13(this, progressBar, 10));
                                ofInt.addListener(new IDAListenerS43S0200000_13(this, progressBar, 10));
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
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        I3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C0NB.LIZIZ("SpeedChallengeAssem", "onCreate --Titlelayout");
        H3();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C0NB.LIZIZ("SpeedChallengeAssem", "onParentSet --- TitleLayout");
        H3();
    }

    public final void N3(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ImageView imageView;
        ImageView imageView2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLL = true;
        this.LLIIIZ = ((C74039T3z) this.LJLJLLL.getValue()).LJLIL;
        this.LLIIIILZ = ((C74039T3z) this.LJLJLLL.getValue()).LJLILLLLZI;
        this.LJLLI = (RelativeLayout) view.findViewById(R.id.j7n);
        this.LJLLILLLL = (ViewGroup) view.findViewById(R.id.ajn);
        this.LJLLJ = (LinearLayout) view.findViewById(R.id.g7f);
        this.LJLLL = (C47061t0) view.findViewById(R.id.e_g);
        this.LJLLLL = (U5I) view.findViewById(R.id.mmy);
        this.LJLZ = (ConstraintLayout) view.findViewById(R.id.ajm);
        this.LJZ = (ConstraintLayout) view.findViewById(R.id.buc);
        this.LJZI = (C47061t0) view.findViewById(R.id.fb5);
        this.LJZL = (CMV) view.findViewById(R.id.mmx);
        this.LL = (ProgressBar) view.findViewById(R.id.hjt);
        this.LLD = (C47121t6) view.findViewById(R.id.m3n);
        this.LJLLLLLL = (LiveIconView) view.findViewById(R.id.ebh);
        this.LLF = (FrameLayout) view.findViewById(R.id.g75);
        this.LLFF = (C41081jM) view.findViewById(R.id.nhg);
        this.LLFFF = (LinearLayout) view.findViewById(R.id.bcf);
        this.LLFII = (CMV) view.findViewById(R.id.m0y);
        this.LLFZ = (C47121t6) view.findViewById(R.id.m3e);
        this.LLI = view.findViewById(R.id.cdg);
        this.LLIFFJFJJ = (FrameLayout) view.findViewById(R.id.anj);
        this.LLII = (ImageView) view.findViewById(R.id.fb1);
        C76819UCx c76819UCx = new C76819UCx(this.LLIIIILZ);
        this.LLIIJI = c76819UCx;
        c76819UCx.LIZ(this);
        if (CCJ.LIZ(getContext()) && (imageView2 = this.LLII) != null) {
            imageView2.setRotation(180.0f);
        }
        if (this.LLIIIZ && (imageView = this.LLII) != null) {
            imageView.setVisibility(8);
        }
        LinearLayout linearLayout = this.LJLLJ;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS25S0100000_5(this, 32));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.ISpeedChallengeAbility
    public final void ry(BattleTask battleTask) {
        if (battleTask.battleBonusConfig == null || battleTask.battleBonusStatus == null || !EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("audience init battleTask ");
        LIZ.append(battleTask);
        C0NB.LIZIZ("SpeedChallengeAssem", X1D.LIZIZ(LIZ));
        BattleBonusConfig battleBonusConfig = battleTask.battleBonusConfig;
        if (battleBonusConfig != null) {
            C76819UCx c76819UCx = this.LLIIJI;
            if (c76819UCx != null) {
                c76819UCx.LJ(battleBonusConfig, "room_enter");
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        BattleBonusStatus battleBonusStatus = battleTask.battleBonusStatus;
        if (battleBonusStatus == null) {
            return;
        }
        C76819UCx c76819UCx2 = this.LLIIJI;
        if (c76819UCx2 != null) {
            c76819UCx2.LJIIIZ(battleBonusStatus);
        } else {
            o.LJIJI("presenter");
            throw null;
        }
    }

    public final void O3(C76814UCs c76814UCs, C76813UCr c76813UCr) {
        SpannableStringBuilder spannableStringBuilder;
        Number valueOf;
        int measuredWidth;
        boolean z;
        if (!this.LJLL) {
            return;
        }
        if ((c76814UCs.LIZ == null && TextUtils.isEmpty(c76814UCs.LIZIZ)) || c76813UCr.LIZIZ == null || c76813UCr.LIZJ == null || c76813UCr.LIZ == null) {
            return;
        }
        BattlePrompt battlePrompt = c76814UCs.LIZ;
        if (battlePrompt != null) {
            spannableStringBuilder = C76799UCd.LIZIZ(battlePrompt);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(c76814UCs.LIZIZ);
        }
        if (o.LJ(c76813UCr.LIZ.getText().toString(), spannableStringBuilder.toString())) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentState = ");
        C76819UCx c76819UCx = this.LLIIJI;
        if (c76819UCx != null) {
            LIZ.append(c76819UCx.LJLL);
            LIZ.append(" and TextString = ");
            LIZ.append((Object) spannableStringBuilder);
            C0NB.LIZIZ("SpeedChallengeRe", X1D.LIZIZ(LIZ));
            int LJIIL = C15380j0.LJIIL() - C15380j0.LIZ(88.0f);
            int LIZ2 = C15380j0.LIZ(94.0f);
            if (c76813UCr.LIZJ.getMeasuredWidth() == 0) {
                valueOf = Integer.valueOf(LIZ2);
            } else {
                valueOf = Float.valueOf(c76813UCr.LIZJ.getMeasuredWidth() * 1.0f);
            }
            c76813UCr.LIZ.setText(spannableStringBuilder);
            N3(c76813UCr.LIZJ);
            if (o.LJ(c76813UCr.LIZJ, this.LJLLILLLL)) {
                int LIZ3 = C15380j0.LIZ(94.0f);
                int measuredWidth2 = c76813UCr.LIZJ.getMeasuredWidth();
                if (measuredWidth2 >= LIZ3) {
                    LIZ3 = measuredWidth2;
                }
                measuredWidth = C15380j0.LIZ(4.0f) + LIZ3;
            } else {
                measuredWidth = c76813UCr.LIZJ.getMeasuredWidth();
            }
            StringBuilder LIZJ = C06460Ne.LIZJ("expectWidth = ", measuredWidth, " and MaxWidth = ", LJIIL, " viewParentwidth = ");
            LIZJ.append(c76813UCr.LIZJ.getMeasuredWidth());
            LIZJ.append(" &&&& ");
            C0NB.LIZIZ("SpeedChallengeRe", X1D.LIZIZ(LIZJ));
            float measureText = c76813UCr.LIZ.getPaint().measureText(spannableStringBuilder.toString()) + C15380j0.LIZ(16.0f);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("needShi and expect = ");
            LIZ4.append(measuredWidth);
            LIZ4.append(" textWidth = ");
            LIZ4.append(measureText);
            C0NB.LJ("SpeedChallengeRe", X1D.LIZIZ(LIZ4));
            if (measuredWidth <= measureText) {
                measuredWidth = (int) Math.ceil(measureText);
            }
            if (LJIIL <= measuredWidth) {
                z = true;
            } else {
                z = false;
            }
            CharSequence text = c76813UCr.LIZ.getText();
            o.LJIIIIZZ(text, "views.textView.text");
            if (text.length() == 0) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("view.textView isempty textis = ");
                LIZ5.append((Object) spannableStringBuilder);
                C0NB.LJ("SpeedChallengeRe", X1D.LIZIZ(LIZ5));
                CMV cmv = c76813UCr.LIZ;
                cmv.setText(C76799UCd.LIZ(cmv, spannableStringBuilder, z));
            }
            if (measuredWidth >= LIZ2) {
                LIZ2 = measuredWidth;
            }
            int[] iArr = new int[2];
            iArr[0] = valueOf.intValue();
            if (!z) {
                LJIIL = LIZ2;
            }
            iArr[1] = LJIIL;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            ofInt.setDuration(150L);
            ofInt.addUpdateListener(new AUListenerS102S0200000_13(this, c76813UCr, 9));
            ofInt.addListener(new C76807UCl(this, c76813UCr, spannableStringBuilder, z, LIZ2));
            c76813UCr.LIZIZ.setAlpha(0.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c76813UCr.LIZIZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, 150L);
            LIZLLL.playSequentially(ofInt, ofFloat);
            LIZLLL.start();
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public final void P3(ImageModel imageModel, long j) {
        int i;
        FrameLayout frameLayout = this.LLIFFJFJJ;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout = this.LJLZ;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = this.LJZ;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("taskTargetCount = ");
        C76819UCx c76819UCx = this.LLIIJI;
        if (c76819UCx != null) {
            LIZ.append(c76819UCx.LJLZ);
            C0NB.LIZIZ("SpeedChallenge", X1D.LIZIZ(LIZ));
            ProgressBar progressBar = this.LL;
            if (progressBar != null) {
                C76819UCx c76819UCx2 = this.LLIIJI;
                if (c76819UCx2 != null) {
                    long j2 = c76819UCx2.LJLZ;
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
            R3();
            C47121t6 c47121t6 = this.LLD;
            if (c47121t6 != null) {
                C76819UCx c76819UCx3 = this.LLIIJI;
                if (c76819UCx3 != null) {
                    Q3(j - (c76819UCx3.LJLLL - c76819UCx3.LJLLLL), c47121t6);
                    if (this.LLIIJLIL) {
                        this.LLIIJLIL = false;
                        if (imageModel != null) {
                            C47061t0 c47061t0 = this.LJZI;
                            if (c47061t0 != null) {
                                c47061t0.setVisibility(0);
                            }
                            C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(this.LJZI);
                            return;
                        }
                        C47061t0 c47061t02 = this.LJZI;
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
            return;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public final void Q3(long j, C47121t6 c47121t6) {
        if (j >= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(j);
            LIZ.append('s');
            c47121t6.setText(X1D.LIZIZ(LIZ));
            return;
        }
        c47121t6.setText("0s");
        if (j >= -2 || this.LLIIIZ) {
            return;
        }
        C76819UCx c76819UCx = this.LLIIJI;
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
        int i2;
        ViewGroup viewGroup;
        int i3;
        o.LJIIIZ(taskState, "taskState");
        if (taskState.compareTo(U2O.DISABLED) > 0) {
            RelativeLayout relativeLayout = this.LJLLI;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            RelativeLayout relativeLayout2 = this.LJLLI;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(1.0f);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BattleBonusState channel state = ");
            LIZ.append(taskState);
            C0NB.LJ("SpeedChallengeAssem", X1D.LIZIZ(LIZ));
        }
        long LIZ2 = C30725C4b.LIZ();
        Boolean bool2 = null;
        switch (U2Q.LIZ[taskState.ordinal()]) {
            case 1:
                RelativeLayout relativeLayout3 = this.LJLLI;
                if (relativeLayout3 != null) {
                    relativeLayout3.setBackgroundResource(R.drawable.cfp);
                }
                FrameLayout frameLayout = this.LLIFFJFJJ;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                LinearLayout linearLayout = this.LLFFF;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                ConstraintLayout constraintLayout = this.LJLZ;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                ValueAnimator valueAnimator = this.LLIIIL;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator2 = this.LLIIIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
                FrameLayout frameLayout2 = this.LLF;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                this.LLIIJLIL = true;
                ImageView imageView = this.LLII;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                C44878HjO.LIZJ("eggtask_reward_start, left_time = ", j, "SpeedChallengeAssem");
                C47121t6 c47121t6 = this.LLFZ;
                if (c47121t6 != null) {
                    C76819UCx c76819UCx = this.LLIIJI;
                    if (c76819UCx != null) {
                        Q3(j - (c76819UCx.LLFFF - c76819UCx.LLFII), c47121t6);
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
                if (!this.LLIIIZ) {
                    FrameLayout frameLayout3 = this.LLIFFJFJJ;
                    if (frameLayout3 != null) {
                        C16880lQ.LJIILJJIL(frameLayout3, new ACListenerS33S0100000_13(this, 56));
                    }
                } else {
                    FrameLayout frameLayout4 = this.LLIFFJFJJ;
                    if (frameLayout4 != null) {
                        C16880lQ.LJIILJJIL(frameLayout4, ViewOnClickListenerC76816UCu.LJLIL);
                    }
                }
                if (!this.LLIIII) {
                    this.LLIIII = true;
                    C47121t6 c47121t62 = this.LLFZ;
                    if (c47121t62 != null) {
                        c47121t62.setVisibility(0);
                    }
                    View view = this.LLI;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    C76819UCx c76819UCx2 = this.LLIIJI;
                    if (c76819UCx2 != null) {
                        C76814UCs c76814UCs = new C76814UCs(c76819UCx2.LLIIII, null);
                        CMV cmv = this.LLFII;
                        C76813UCr c76813UCr = new C76813UCr(cmv, cmv, this.LLFFF);
                        U2O.BONUS_IN_PROCESS.ordinal();
                        O3(c76814UCs, c76813UCr);
                        L3();
                        CL6.LIZIZ("match_color_eggs_reward_start");
                        boolean z = this.LLIIIZ;
                        JSONObject jSONObject = new JSONObject();
                        C05630Jz.LJFF(jSONObject, "match_left_time", j);
                        if (z) {
                            U27.LJIILLIIL(jSONObject, "reward_start");
                        } else {
                            U27.LJIIZILJ(jSONObject, "reward_start");
                        }
                        C75832TpU.LIZ.LJJIJL(false, 2, false, false);
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
                UCK uck = UCK.REWARD;
                C76457TzZ.LIZ(uck, LIZ2, this.LLIIIZ);
                C76457TzZ.LIZIZ(uck.getValue(), this.LLIIIZ);
                return;
            case 2:
                RelativeLayout relativeLayout4 = this.LJLLI;
                if (relativeLayout4 != null) {
                    relativeLayout4.setBackgroundResource(R.drawable.cfo);
                }
                ImageView imageView2 = this.LLII;
                if (imageView2 != null) {
                    if (this.LLIIIZ) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    imageView2.setVisibility(i3);
                }
                this.LLIIIJ.removeCallbacksAndMessages(null);
                this.LLIIII = false;
                AqS40S0100100_13 aqS40S0100100_13 = new AqS40S0100100_13(this, j, 3);
                C76819UCx c76819UCx3 = this.LLIIJI;
                if (c76819UCx3 != null) {
                    ImageModel imageModel = c76819UCx3.LL;
                    ViewGroup viewGroup2 = this.LJLLILLLL;
                    if (viewGroup2 != null && viewGroup2.getVisibility() == 8) {
                        aqS40S0100100_13.invoke();
                    } else {
                        U5I u5i = this.LJLLLL;
                        if (u5i != null) {
                            u5i.removeCallbacks(u5i.LJLJL);
                            ValueAnimator valueAnimator3 = u5i.LJLJLJ;
                            if (valueAnimator3 != null) {
                                valueAnimator3.removeAllUpdateListeners();
                            }
                            u5i.LJLJL = null;
                            u5i.LJLJLJ = null;
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLILLLL, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                        ofFloat.setDuration(150L);
                        P3(imageModel, j);
                        ConstraintLayout constraintLayout2 = this.LJLZ;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLZ, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat2.setDuration(150L);
                        ofFloat2.addListener(new IDAListenerS43S0200000_13(this, aqS40S0100100_13, 9));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                    C44878HjO.LIZJ("eggtask_task_update, left_time = ", j, "SpeedChallengeAssem");
                    UCK uck2 = UCK.PROGRESS;
                    C76457TzZ.LIZ(uck2, LIZ2, this.LLIIIZ);
                    C76457TzZ.LIZIZ(uck2.getValue(), this.LLIIIZ);
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            case 3:
                RelativeLayout relativeLayout5 = this.LJLLI;
                if (relativeLayout5 != null) {
                    relativeLayout5.setBackgroundResource(R.drawable.cfp);
                }
                ViewGroup viewGroup3 = this.LJLLILLLL;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
                FrameLayout frameLayout5 = this.LLIFFJFJJ;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(8);
                }
                ConstraintLayout constraintLayout3 = this.LJLZ;
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
                ConstraintLayout constraintLayout4 = this.LJZ;
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(8);
                }
                this.LLIIJLIL = true;
                LinearLayout linearLayout2 = this.LLFFF;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                this.LLIIII = false;
                this.LLIIL = false;
                ValueAnimator valueAnimator4 = this.LLIIIL;
                if (valueAnimator4 != null) {
                    bool = Boolean.valueOf(valueAnimator4.isRunning());
                } else {
                    bool = null;
                }
                if (!C29306Beo.LJIL(bool)) {
                    ValueAnimator valueAnimator5 = this.LLIIIL;
                    if (valueAnimator5 != null) {
                        valueAnimator5.removeAllUpdateListeners();
                    }
                    ValueAnimator valueAnimator6 = this.LLIIIL;
                    if (valueAnimator6 != null) {
                        valueAnimator6.end();
                    }
                }
                C76819UCx c76819UCx4 = this.LLIIJI;
                if (c76819UCx4 != null) {
                    List<PreviewPeriod> list = c76819UCx4.LJLLI;
                    if (list.size() != 0) {
                        C76819UCx c76819UCx5 = this.LLIIJI;
                        if (c76819UCx5 != null) {
                            long j2 = c76819UCx5.LJLLILLLL - j;
                            if (list.size() > 1) {
                                int size = list.size();
                                i = 0;
                                for (int i4 = 0; i4 < size && ((PreviewPeriod) ListProtector.get(list, i4)).duration < j2; i4++) {
                                    j2 -= ((PreviewPeriod) ListProtector.get(list, i4)).duration;
                                    i++;
                                }
                            } else {
                                i = 0;
                            }
                            if (((PreviewPeriod) ListProtector.get(list, i)).icon != null) {
                                C47061t0 c47061t0 = this.LJLLL;
                                if (c47061t0 != null) {
                                    c47061t0.setVisibility(0);
                                }
                                C15650jR.LIZ().LJIIIZ(((PreviewPeriod) ListProtector.get(list, i)).icon).LJIIJJI(this.LJLLL);
                                U5I u5i2 = this.LJLLLL;
                                if (u5i2 != null) {
                                    u5i2.setTextSize(12.0f);
                                }
                            } else {
                                C47061t0 c47061t02 = this.LJLLL;
                                if (c47061t02 != null) {
                                    c47061t02.setVisibility(8);
                                }
                            }
                            LiveIconView liveIconView = this.LJLLLLLL;
                            if (liveIconView != null) {
                                if (i == 0) {
                                    i2 = 0;
                                } else {
                                    i2 = 8;
                                }
                                liveIconView.setVisibility(i2);
                            }
                            LinearLayout linearLayout3 = this.LJLLJ;
                            if (linearLayout3 != null) {
                                linearLayout3.setAlpha(0.0f);
                            }
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJLLJ, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat3.setDuration(100L);
                            ofFloat3.start();
                            SpannableStringBuilder LIZIZ = C76799UCd.LIZIZ(((PreviewPeriod) ListProtector.get(list, i)).promot);
                            U5I u5i3 = this.LJLLLL;
                            if (u5i3 != null && (viewGroup = this.LJLLILLLL) != null) {
                                U5I.LIZIZ(u5i3, LIZIZ);
                                N3(viewGroup);
                                int LIZ3 = C15380j0.LIZ(94.0f);
                                int measuredWidth = viewGroup.getMeasuredWidth();
                                if (measuredWidth >= LIZ3) {
                                    LIZ3 = measuredWidth;
                                }
                                C78866UxK.LJJLJ(LIZ3, viewGroup);
                                C15380j0.LJIIL();
                                C15380j0.LIZ(88.0f);
                                U5I.LIZIZ(u5i3, LIZIZ);
                                if (list.size() > 1 && i != list.size() - 1) {
                                    int size2 = list.size();
                                    long j3 = 0;
                                    int i5 = i;
                                    while (i5 < size2) {
                                        if (i5 == i) {
                                            j3 = (((PreviewPeriod) ListProtector.get(list, i)).duration - j2) * 1000;
                                        } else {
                                            j3 += ((PreviewPeriod) ListProtector.get(list, i5)).duration * 1000;
                                        }
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("noticeDuration = ");
                                        LIZ4.append(j3);
                                        LIZ4.append(" index = ");
                                        LIZ4.append(i5);
                                        C0NB.LIZIZ("SpeedChallengeAssem", X1D.LIZIZ(LIZ4));
                                        List<PreviewPeriod> list2 = list;
                                        this.LLIIIJ.postDelayed(new ARunnableS3S0401000_13(this, i5, list2, viewGroup, u5i3, 2), j3);
                                        i5++;
                                        list = list2;
                                    }
                                }
                            }
                        } else {
                            o.LJIJI("presenter");
                            throw null;
                        }
                    }
                    boolean z2 = this.LLIIIZ;
                    JSONObject jSONObject2 = new JSONObject();
                    C05630Jz.LJFF(jSONObject2, "match_left_time", j);
                    if (z2) {
                        U27.LJIILLIIL(jSONObject2, "task_preview");
                    } else {
                        U27.LJIIZILJ(jSONObject2, "task_preview");
                    }
                    CL6.LIZIZ("match_color_eggs_guide");
                    C75832TpU.LIZ.LJJIJL(false, 0, false, false);
                    C44878HjO.LIZJ("eggtask_preview, left_time = ", j, "SpeedChallengeAssem");
                    UCK uck3 = UCK.PREVIEW;
                    C76457TzZ.LIZ(uck3, LIZ2, this.LLIIIZ);
                    C76457TzZ.LIZIZ(uck3.getValue(), this.LLIIIZ);
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            case 4:
                RelativeLayout relativeLayout6 = this.LJLLI;
                if (relativeLayout6 == null || relativeLayout6.getVisibility() != 0) {
                    return;
                }
                RelativeLayout relativeLayout7 = this.LJLLI;
                if (relativeLayout7 != null) {
                    relativeLayout7.setAlpha(1.0f);
                }
                RelativeLayout relativeLayout8 = this.LJLLI;
                if (relativeLayout8 != null) {
                    relativeLayout8.setVisibility(8);
                }
                ValueAnimator valueAnimator7 = this.LLIIIL;
                if (valueAnimator7 != null) {
                    bool2 = Boolean.valueOf(valueAnimator7.isRunning());
                }
                if (!C29306Beo.LJIL(bool2)) {
                    ValueAnimator valueAnimator8 = this.LLIIIL;
                    if (valueAnimator8 != null) {
                        valueAnimator8.removeAllUpdateListeners();
                    }
                    ValueAnimator valueAnimator9 = this.LLIIIL;
                    if (valueAnimator9 != null) {
                        valueAnimator9.end();
                    }
                }
                U5I u5i4 = this.LJLLLL;
                if (u5i4 != null) {
                    u5i4.setTextSize(13.0f);
                }
                CMV cmv2 = this.LLFII;
                if (cmv2 != null) {
                    cmv2.setTextSize(1, 13.0f);
                }
                CMV cmv3 = this.LJZL;
                if (cmv3 != null) {
                    cmv3.setTextSize(1, 13.0f);
                }
                ViewGroup viewGroup4 = this.LJLLILLLL;
                if (viewGroup4 != null) {
                    C78866UxK.LJJLJ(-1, viewGroup4);
                }
                ConstraintLayout constraintLayout5 = this.LJLZ;
                if (constraintLayout5 != null) {
                    C78866UxK.LJJLJ(-1, constraintLayout5);
                }
                LinearLayout linearLayout4 = this.LLFFF;
                if (linearLayout4 != null) {
                    C78866UxK.LJJLJ(-1, linearLayout4);
                }
                FrameLayout frameLayout6 = this.LLF;
                if (frameLayout6 != null) {
                    frameLayout6.setVisibility(8);
                }
                C41081jM c41081jM = this.LLFF;
                if (c41081jM != null) {
                    c41081jM.setVisibility(8);
                }
                ProgressBar progressBar = this.LL;
                if (progressBar != null) {
                    progressBar.setProgress(0);
                }
                ProgressBar progressBar2 = this.LL;
                if (progressBar2 != null) {
                    progressBar2.setMax(100);
                }
                ConstraintLayout constraintLayout6 = this.LJLZ;
                if (constraintLayout6 != null) {
                    constraintLayout6.setVisibility(8);
                }
                this.LLIIJLIL = true;
                LinearLayout linearLayout5 = this.LLFFF;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                ViewGroup viewGroup5 = this.LJLLILLLL;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(8);
                }
                ImageView imageView3 = this.LLII;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                ConstraintLayout constraintLayout7 = this.LJZ;
                if (constraintLayout7 != null) {
                    constraintLayout7.setVisibility(8);
                }
                LiveIconView liveIconView2 = this.LJLLLLLL;
                if (liveIconView2 != null) {
                    liveIconView2.setVisibility(8);
                }
                this.LLIIII = false;
                this.LLIIL = false;
                return;
            case 5:
                FrameLayout frameLayout7 = this.LLIFFJFJJ;
                if (frameLayout7 != null) {
                    frameLayout7.setVisibility(0);
                }
                LinearLayout linearLayout6 = this.LLFFF;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
                C47121t6 c47121t63 = this.LLFZ;
                if (c47121t63 != null) {
                    c47121t63.setVisibility(8);
                }
                View view2 = this.LLI;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                RelativeLayout relativeLayout9 = this.LJLLI;
                if (relativeLayout9 != null) {
                    relativeLayout9.setBackgroundResource(R.drawable.cfo);
                }
                FrameLayout frameLayout8 = this.LLF;
                if (frameLayout8 != null) {
                    frameLayout8.setVisibility(8);
                }
                ValueAnimator valueAnimator10 = this.LLIIIL;
                if (valueAnimator10 != null) {
                    valueAnimator10.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator11 = this.LLIIIL;
                if (valueAnimator11 != null) {
                    valueAnimator11.end();
                }
                this.LLIIL = false;
                boolean z3 = this.LLIIIZ;
                C76819UCx c76819UCx6 = this.LLIIJI;
                if (c76819UCx6 != null) {
                    U27.LJIIL(j, c76819UCx6.LJZ, z3);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("eggtask_settle, left_time = ");
                    LIZ5.append(j);
                    LIZ5.append(" , task failed");
                    C0NB.LJIIIZ("SpeedChallengeAssem", X1D.LIZIZ(LIZ5));
                    ProgressBar progressBar3 = this.LL;
                    if (progressBar3 != null) {
                        progressBar3.setProgress(0);
                    }
                    ConstraintLayout constraintLayout8 = this.LJLZ;
                    if (constraintLayout8 != null) {
                        constraintLayout8.setVisibility(8);
                    }
                    this.LLIIJLIL = true;
                    ImageView imageView4 = this.LLII;
                    if (imageView4 != null) {
                        imageView4.setVisibility(8);
                    }
                    C76814UCs c76814UCs2 = new C76814UCs(null, C15380j0.LJIILJJIL(R.string.my3));
                    CMV cmv4 = this.LLFII;
                    O3(c76814UCs2, new C76813UCr(cmv4, cmv4, this.LLFFF));
                    LinearLayout linearLayout7 = this.LLFFF;
                    if (linearLayout7 != null) {
                        linearLayout7.postDelayed(new ARunnableS16S0100100_13(this, j, 1), 3000L);
                    }
                    UCK uck4 = UCK.PROGRESS_RESULT;
                    C76457TzZ.LIZ(uck4, LIZ2, this.LLIIIZ);
                    C76457TzZ.LIZIZ(uck4.getValue(), this.LLIIIZ);
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            case 6:
                FrameLayout frameLayout9 = this.LLIFFJFJJ;
                if (frameLayout9 != null) {
                    frameLayout9.setVisibility(0);
                }
                LinearLayout linearLayout8 = this.LLFFF;
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                C47121t6 c47121t64 = this.LLFZ;
                if (c47121t64 != null) {
                    c47121t64.setVisibility(8);
                }
                View view3 = this.LLI;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                this.LLIIII = false;
                this.LLIIL = false;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("eggtask_task_settle, left_time = ");
                LIZ6.append(j);
                LIZ6.append(" ,task succeed");
                C0NB.LJIIIZ("SpeedChallengeAssem", X1D.LIZIZ(LIZ6));
                RelativeLayout relativeLayout10 = this.LJLLI;
                if (relativeLayout10 != null) {
                    relativeLayout10.setBackgroundResource(R.drawable.clp);
                }
                ConstraintLayout constraintLayout9 = this.LJLZ;
                if (constraintLayout9 != null) {
                    constraintLayout9.setVisibility(8);
                }
                this.LLIIJLIL = true;
                ImageView imageView5 = this.LLII;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                C76814UCs c76814UCs3 = new C76814UCs(null, C15380j0.LJIILJJIL(R.string.mxm));
                CMV cmv5 = this.LLFII;
                O3(c76814UCs3, new C76813UCr(cmv5, cmv5, this.LLFFF));
                L3();
                LinearLayout linearLayout9 = this.LLFFF;
                if (linearLayout9 != null) {
                    linearLayout9.postDelayed(new ARunnableS49S0100000_13(this, 52), 3000L);
                }
                UCK uck5 = UCK.PROGRESS_RESULT;
                C76457TzZ.LIZ(uck5, LIZ2, this.LLIIIZ);
                C76457TzZ.LIZIZ(uck5.getValue(), this.LLIIIZ);
                return;
            case 7:
                FrameLayout frameLayout10 = this.LLIFFJFJJ;
                if (frameLayout10 != null) {
                    frameLayout10.setVisibility(0);
                }
                LinearLayout linearLayout10 = this.LLFFF;
                if (linearLayout10 != null) {
                    linearLayout10.setVisibility(0);
                }
                ConstraintLayout constraintLayout10 = this.LJZ;
                if (constraintLayout10 != null) {
                    constraintLayout10.setVisibility(8);
                }
                ValueAnimator valueAnimator12 = this.LLIIIL;
                if (valueAnimator12 != null) {
                    valueAnimator12.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator13 = this.LLIIIL;
                if (valueAnimator13 != null) {
                    valueAnimator13.end();
                }
                FrameLayout frameLayout11 = this.LLF;
                if (frameLayout11 != null) {
                    frameLayout11.setVisibility(8);
                }
                this.LLIIJLIL = true;
                this.LLIIII = false;
                this.LLIIL = false;
                ValueAnimator valueAnimator14 = this.LLIIIL;
                if (valueAnimator14 != null) {
                    valueAnimator14.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator15 = this.LLIIIL;
                if (valueAnimator15 != null) {
                    valueAnimator15.end();
                }
                C44878HjO.LIZJ("eggtask_reward_settle, left_time = ", j, "SpeedChallengeAssem");
                C47121t6 c47121t65 = this.LLFZ;
                if (c47121t65 != null) {
                    c47121t65.setVisibility(8);
                }
                View view4 = this.LLI;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                C76819UCx c76819UCx7 = this.LLIIJI;
                if (c76819UCx7 != null) {
                    C76814UCs c76814UCs4 = new C76814UCs(c76819UCx7.LLIIIILZ, null);
                    CMV cmv6 = this.LLFII;
                    O3(c76814UCs4, new C76813UCr(cmv6, cmv6, this.LLFFF));
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("eggtask_reward_over, left_time = ");
                    C0RN.LJ(LIZ7, j, LIZ7, "SpeedChallengeAssem");
                    U27.LJIIIIZZ(j, this.LLIIIZ);
                    UCK uck6 = UCK.REWARD_RESULT;
                    C76457TzZ.LIZ(uck6, LIZ2, this.LLIIIZ);
                    C76457TzZ.LIZIZ(uck6.getValue(), this.LLIIIZ);
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            default:
                return;
        }
    }
}
