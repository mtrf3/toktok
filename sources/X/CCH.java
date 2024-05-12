package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CCH extends CountDownTimer {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ LiveAbsPollEffectWidget LIZIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        LiveAbsPollEffectWidget liveAbsPollEffectWidget = this.LIZIZ;
        if (liveAbsPollEffectWidget.LJLIL == 257) {
            liveAbsPollEffectWidget.hide();
        }
        liveAbsPollEffectWidget.LLFII();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        String str;
        Resources resources;
        boolean z;
        long j2;
        long j3;
        PollOptionInfo pollOptionInfo;
        PollOptionInfo pollOptionInfo2;
        long j4 = j / 1000;
        boolean z2 = this.LIZ;
        if (z2) {
            j4 -= 5;
        }
        LiveAbsPollEffectWidget liveAbsPollEffectWidget = this.LIZIZ;
        if (!z2) {
            liveAbsPollEffectWidget.getClass();
        } else if (liveAbsPollEffectWidget.LJLIL == 257) {
            if (1 <= j4 && j4 < 11) {
                Context context = liveAbsPollEffectWidget.context;
                if (context != null && (resources = context.getResources()) != null) {
                    int i = (int) j4;
                    str = resources.getQuantityString(R.plurals.o1, i, Integer.valueOf(i));
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C47121t6 c47121t6 = liveAbsPollEffectWidget.LJLJI;
                    if (c47121t6 != null) {
                        c47121t6.setText(str);
                        C47121t6 c47121t62 = liveAbsPollEffectWidget.LJLJI;
                        if (c47121t62 != null) {
                            c47121t62.setVisibility(0);
                        } else {
                            o.LJIJI("tvPollDownTime");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tvPollDownTime");
                        throw null;
                    }
                }
            } else {
                C47121t6 c47121t63 = liveAbsPollEffectWidget.LJLJI;
                if (c47121t63 != null) {
                    c47121t63.setVisibility(4);
                } else {
                    o.LJIJI("tvPollDownTime");
                    throw null;
                }
            }
        } else {
            C47121t6 c47121t64 = liveAbsPollEffectWidget.LJLJI;
            if (c47121t64 != null) {
                c47121t64.setVisibility(8);
            } else {
                o.LJIJI("tvPollDownTime");
                throw null;
            }
        }
        LiveAbsPollEffectWidget liveAbsPollEffectWidget2 = this.LIZIZ;
        PollMessage pollMessage = liveAbsPollEffectWidget2.LJLJLJ;
        if (pollMessage != null && pollMessage.messageType == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<PollOptionInfo> list = liveAbsPollEffectWidget2.LJLJL;
            if (list != null && list.size() == 2) {
                List<PollOptionInfo> list2 = liveAbsPollEffectWidget2.LJLJL;
                if (list2 != null && (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list2, 0)) != null) {
                    j2 = pollOptionInfo2.votes;
                } else {
                    j2 = 0;
                }
                List<PollOptionInfo> list3 = liveAbsPollEffectWidget2.LJLJL;
                if (list3 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list3, 1)) != null) {
                    j3 = pollOptionInfo.votes;
                } else {
                    j3 = 0;
                }
            } else {
                j2 = 0;
                j3 = 0;
            }
            if (j2 > liveAbsPollEffectWidget2.LJLLL || j3 > liveAbsPollEffectWidget2.LJLLLL) {
                this.LIZIZ.LJLZ();
                this.LIZIZ.LLIIJI();
            }
        }
        if (j4 < 0) {
            LiveAbsPollEffectWidget liveAbsPollEffectWidget3 = this.LIZIZ;
            liveAbsPollEffectWidget3.LLF = 0;
            liveAbsPollEffectWidget3.LLIIL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CCH(long j, boolean z, LiveAbsPollEffectWidget liveAbsPollEffectWidget) {
        super(j, 1000L);
        this.LIZ = z;
        this.LIZIZ = liveAbsPollEffectWidget;
    }
}
