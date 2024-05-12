package com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget;

import X.C012403c;
import X.C15380j0;
import X.C15620jO;
import X.C29232Bdc;
import X.C29306Beo;
import X.C47061t0;
import X.C47121t6;
import X.C61845OOz;
import X.C73318Sq2;
import X.C73943T0h;
import X.C8HI;
import X.CCC;
import X.CCG;
import X.CCK;
import X.CCL;
import X.CKB;
import X.CN1;
import X.Q8U;
import X.X1D;
import X.YBU;
import Y.ARunnableS2S0100200_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.AnchorResumePollEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftPollEffectWidget extends LiveAbsPollEffectWidget {
    public final int LLFF;
    public final int LLFFF;
    public final int LLFII;
    public C47061t0 LLFZ;
    public C47061t0 LLI;
    public C47121t6 LLIFFJFJJ;
    public C47121t6 LLII;
    public final C73318Sq2 LLIIII;
    public ConstraintLayout LLIIIILZ;

    public LiveGiftPollEffectWidget() {
        this(0);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLII(int i) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d5y;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLIILII() {
        if (this.LJLLJ) {
            return;
        }
        this.LJLLJ = true;
        CCG.LIZLLL(this.LJLJLJ, this.dataChannel, this.LL, CCC.GIFT);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel;
        if (C29232Bdc.LJFF(this.dataChannel)) {
            return;
        }
        super.show();
        if (this.LLFF == 257 && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(PublicScreenGiftPollStateVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LJLZ() {
        ImageModel imageModel;
        Gift gift;
        Gift gift2;
        super.LJLZ();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        if (this.LLFF != 257) {
            C47061t0 c47061t0 = this.LLFZ;
            ImageModel imageModel2 = null;
            if (pollGifts != null && (gift2 = pollGifts.LJLIL) != null) {
                imageModel = gift2.image;
            } else {
                imageModel = null;
            }
            C15620jO.LIZIZ(imageModel, c47061t0);
            C47061t0 c47061t02 = this.LLI;
            if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
                imageModel2 = gift.image;
            }
            C15620jO.LIZIZ(imageModel2, c47061t02);
        }
        C47061t0 c47061t03 = this.LLFZ;
        if (c47061t03 != null) {
            c47061t03.setAlpha(1.0f);
        }
        C47061t0 c47061t04 = this.LLI;
        if (c47061t04 == null) {
            return;
        }
        c47061t04.setAlpha(1.0f);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LJZ() {
        C47061t0 c47061t0;
        ImageModel imageModel;
        super.LJZ();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        if (this.LLFF != 257) {
            C47061t0 c47061t02 = this.LLFZ;
            ImageModel imageModel2 = null;
            if (pollGifts != null) {
                imageModel = pollGifts.LJLJI;
            } else {
                imageModel = null;
            }
            C15620jO.LIZIZ(imageModel, c47061t02);
            C47061t0 c47061t03 = this.LLI;
            if (pollGifts != null) {
                imageModel2 = pollGifts.LJLJJI;
            }
            C15620jO.LIZIZ(imageModel2, c47061t03);
        }
        if (this.LLFF == 257) {
            int i = this.LJLZ;
            if (i != 1) {
                if (i != 2 || (c47061t0 = this.LLFZ) == null) {
                    return;
                }
                c47061t0.setAlpha(0.4f);
                return;
            }
            C47061t0 c47061t04 = this.LLI;
            if (c47061t04 == null) {
                return;
            }
            c47061t04.setAlpha(0.4f);
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LL() {
        ImageModel imageModel;
        ImageModel imageModel2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        Gift gift;
        Gift gift2;
        super.LL();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        C47061t0 c47061t0 = this.LLFZ;
        PollStartContent pollStartContent = null;
        ViewGroup.LayoutParams layoutParams4 = null;
        if (pollGifts != null && (gift2 = pollGifts.LJLIL) != null) {
            imageModel = gift2.icon;
        } else {
            imageModel = null;
        }
        C15620jO.LIZIZ(imageModel, c47061t0);
        C47061t0 c47061t02 = this.LLI;
        if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
            imageModel2 = gift.icon;
        } else {
            imageModel2 = null;
        }
        C15620jO.LIZIZ(imageModel2, c47061t02);
        this.LLIIII.LIZ(C73943T0h.LIZ().LJ(CCL.class).LJJJJZI(new AfS57S0100000_5(this, 129)));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, AnchorResumePollEvent.class, new AqS171S0100000_5(this, 456));
        }
        switch (this.LLFF) {
            case 257:
                C47061t0 c47061t03 = this.LLFZ;
                if (c47061t03 != null) {
                    layoutParams = c47061t03.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                C29306Beo.LJJJJZI(C15380j0.LIZ(29.0f), this.LLFZ);
                if (layoutParams != null) {
                    layoutParams.height = C15380j0.LIZ(24.0f);
                    layoutParams.width = C15380j0.LIZ(24.0f);
                }
                C47061t0 c47061t04 = this.LLFZ;
                if (c47061t04 != null) {
                    c47061t04.setLayoutParams(layoutParams);
                }
                C47061t0 c47061t05 = this.LLI;
                if (c47061t05 != null) {
                    layoutParams2 = c47061t05.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = C15380j0.LIZ(24.0f);
                        layoutParams2.width = C15380j0.LIZ(24.0f);
                    }
                } else {
                    layoutParams2 = null;
                }
                C47061t0 c47061t06 = this.LLI;
                if (c47061t06 != null) {
                    c47061t06.setLayoutParams(layoutParams2);
                }
                C47121t6 c47121t6 = this.LLIFFJFJJ;
                if (c47121t6 != null) {
                    layoutParams3 = c47121t6.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                C29306Beo.LJJLI(C15380j0.LIZ(30.0f), this.LLIFFJFJJ);
                C47121t6 c47121t62 = this.LLIFFJFJJ;
                if (c47121t62 != null) {
                    c47121t62.setLayoutParams(layoutParams3);
                }
                ConstraintLayout constraintLayout = this.LLIIIILZ;
                if (constraintLayout != null && (layoutParams4 = constraintLayout.getLayoutParams()) != null) {
                    layoutParams4.width = C15380j0.LIZ(214.0f);
                }
                ConstraintLayout constraintLayout2 = this.LLIIIILZ;
                if (constraintLayout2 != null) {
                    constraintLayout2.setLayoutParams(layoutParams4);
                }
                LLFF();
                return;
            case 258:
                PollMessage pollMessage = CKB.INSTANCE.pollMessage;
                this.LJLJLJ = pollMessage;
                if (pollMessage != null) {
                    pollStartContent = pollMessage.startContent;
                }
                this.LJLJJLL = pollStartContent;
                return;
            case 259:
                LLFFF(CCC.GIFT);
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLIIJI() {
        boolean z;
        long j;
        long j2;
        long j3;
        PollOptionInfo pollOptionInfo;
        PollOptionInfo pollOptionInfo2;
        PollOptionInfo pollOptionInfo3;
        PollOptionInfo pollOptionInfo4;
        super.LLIIJI();
        List<PollOptionInfo> list = this.LJLJL;
        int i = 0;
        if (list != null && list.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List<PollOptionInfo> list2 = this.LJLJL;
            long j4 = 0;
            if (list2 != null && (pollOptionInfo4 = (PollOptionInfo) ListProtector.get(list2, 0)) != null) {
                j = pollOptionInfo4.votes;
            } else {
                j = 0;
            }
            List<PollOptionInfo> list3 = this.LJLJL;
            if (list3 != null && (pollOptionInfo3 = (PollOptionInfo) ListProtector.get(list3, 1)) != null) {
                j2 = pollOptionInfo3.votes;
            } else {
                j2 = 0;
            }
            if (j > j2) {
                i = 1;
            } else {
                List<PollOptionInfo> list4 = this.LJLJL;
                if (list4 != null && (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list4, 0)) != null) {
                    j3 = pollOptionInfo2.votes;
                } else {
                    j3 = 0;
                }
                List<PollOptionInfo> list5 = this.LJLJL;
                if (list5 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list5, 1)) != null) {
                    j4 = pollOptionInfo.votes;
                }
                if (j3 < j4) {
                    i = 2;
                }
            }
            this.LJLZ = i;
        } else {
            this.LJLZ = 0;
        }
        if (this.LLFF == 257) {
            int i2 = this.LJLZ;
            if (i2 != 1) {
                if (i2 != 2) {
                    C29306Beo.LJJJJZI(C15380j0.LIZ(29.0f), this.LLFZ);
                    C29306Beo.LJJLI(C15380j0.LIZ(30.0f), this.LLIFFJFJJ);
                    return;
                } else {
                    C29306Beo.LJJJJZI(C15380j0.LIZ(16.0f), this.LLFZ);
                    C29306Beo.LJJLI(C15380j0.LIZ(39.0f), this.LLIFFJFJJ);
                    return;
                }
            }
            C29306Beo.LJJJJZI(C15380j0.LIZ(39.0f), this.LLFZ);
            C29306Beo.LJJLI(C15380j0.LIZ(16.0f), this.LLIFFJFJJ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        DataChannel dataChannel;
        super.hide();
        if (this.LLFF == 257 && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(PublicScreenGiftPollStateVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void init() {
        super.init();
        View findViewById = findViewById(R.id.fwy);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.live_gift_poll_view)");
        this.LJLILLLLZI = (YBU) findViewById;
        this.LLFZ = (C47061t0) this.contentView.findViewById(R.id.hw8);
        this.LLI = (C47061t0) this.contentView.findViewById(R.id.hwd);
        this.LLIFFJFJJ = (C47121t6) this.contentView.findViewById(R.id.hwg);
        this.LLII = (C47121t6) this.contentView.findViewById(R.id.hwa);
        if (!LLILII(this.context)) {
            C47121t6 c47121t6 = this.LLII;
            if (c47121t6 != null) {
                c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
            }
            C47121t6 c47121t62 = this.LLIFFJFJJ;
            if (c47121t62 != null) {
                c47121t62.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
            }
        }
        this.LLIIIILZ = (ConstraintLayout) this.contentView.findViewById(R.id.duj);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        this.LLIIII.LIZLLL();
    }

    public LiveGiftPollEffectWidget(int i) {
        super(i);
        this.LLFF = i;
        this.LLFFF = 1000000;
        this.LLFII = 1000;
        this.LLIIII = new C73318Sq2();
    }

    public static boolean LLILII(Context context) {
        if (context == null) {
            return false;
        }
        if (!o.LJ(context.getResources().getConfiguration().locale.getLanguage(), "ar") && C012403c.LIZ(context) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLIIIILZ(float f) {
        super.LLIIIILZ(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1.kv0(com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class), java.lang.Boolean.TRUE) == false) goto L12;
     */
    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIJ(com.bytedance.android.livesdk.model.message.PollMessage r4) {
        /*
            r3 = this;
            super.LLIIIJ(r4)
            int r1 = r3.LLFF
            r0 = 257(0x101, float:3.6E-43)
            if (r1 != r0) goto L47
            java.util.List<com.bytedance.android.livesdk.model.message.PollOptionInfo> r0 = r3.LJLJL
            if (r0 == 0) goto L22
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L22
            com.bytedance.android.livesdk.model.message.PollMessage r0 = r3.LJLJLJ
            if (r0 == 0) goto L22
            java.lang.Integer r2 = r0.pollKind
            X.CCC r0 = X.CCC.GIFT
            int r1 = r0.ordinal()
            if (r2 != 0) goto L26
        L22:
            r3.hide()
            return
        L26:
            int r0 = r2.intValue()
            if (r0 != r1) goto L22
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.LJLL
            if (r0 == 0) goto L47
            boolean r0 = r0.giftPollVoteEnabled
            if (r0 != 0) goto L47
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.dataChannel
            if (r1 == 0) goto L22
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r1 = r1.kv0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L47
            goto L22
        L47:
            r3.show()
            r3.LLIIIL()
            r3.LLIIJLIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget.LLIIIJ(com.bytedance.android.livesdk.model.message.PollMessage):void");
    }

    public final String LLIIZ(long j) {
        int i = this.LLFFF;
        if (j >= i) {
            long j2 = j * 1;
            long j3 = i * 999;
            if (j > j3) {
                j2 = j3 * 1;
            }
            String LIZIZ = Q8U.LIZIZ(new Object[]{Double.valueOf((j2 * 1.0d) / i)}, 1, "%.3f", "format(format, *args)");
            if (LLILII(this.context)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LLIL(LIZIZ));
                LIZ.append("m x");
                return X1D.LIZIZ(LIZ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("x ");
            LIZ2.append(LLIL(LIZIZ));
            LIZ2.append('m');
            return X1D.LIZIZ(LIZ2);
        }
        int i2 = this.LLFII;
        if (j >= i2) {
            String LIZIZ2 = Q8U.LIZIZ(new Object[]{Double.valueOf((j * 1.0d) / i2)}, 1, "%.3f", "format(format, *args)");
            if (LLILII(this.context)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LLIL(LIZIZ2));
                LIZ3.append("k x");
                return X1D.LIZIZ(LIZ3);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("x ");
            LIZ4.append(LLIL(LIZIZ2));
            LIZ4.append('k');
            return X1D.LIZIZ(LIZ4);
        }
        if (LLILII(this.context)) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(j);
            LIZ5.append(" x");
            return X1D.LIZIZ(LIZ5);
        }
        return C61845OOz.LIZ("x ", j);
    }

    public final String LLIL(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String substring = str.substring(0, 4);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (ujb.o.LJJJJ(substring, ".", false)) {
                String substring2 = substring.substring(0, 3);
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring2;
            }
            return substring;
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLIIII(long j, long j2) {
        if (j > this.LJLLL || j2 > this.LJLLLL) {
            this.LJLLL = j;
            this.LJLLLL = j2;
            LJZL().LJI(j, j2);
            TextView textView = (TextView) this.contentView.findViewById(R.id.hwa);
            TextView textView2 = (TextView) this.contentView.findViewById(R.id.hwg);
            if (LLILII(this.context)) {
                textView.setText(LLIIZ(j));
                textView2.setText(LLIIZ(j2));
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LLIIZ(j));
                LIZ.append(' ');
                textView.setText(X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LLIIZ(j2));
                LIZ2.append(' ');
                textView2.setText(X1D.LIZIZ(LIZ2));
            }
            LJZL().post(new ARunnableS2S0100200_5(j, j2, this, 2));
        }
    }
}
