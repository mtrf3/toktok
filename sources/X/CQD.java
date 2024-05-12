package X;

import android.content.res.Resources;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.GuidanceVisibilityChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class CQD implements InterfaceC31332CRk<CQJ> {
    public int LIZ;

    @Override // X.InterfaceC31332CRk
    public final void LIZ(CQJ cqj, CQQ context) {
        int i;
        C19690px c19690px;
        SpannableStringBuilder spannableStringBuilder;
        DataChannel dataChannel;
        C19690px c19690px2;
        C19690px c19690px3;
        int i2;
        CharSequence LJIIIIZZ;
        CQJ model = cqj;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(context, "context");
        if (!context.LJFF || model.LIZJ || (i = this.LIZ) > 0) {
            return;
        }
        this.LIZ = i + 1;
        DataChannel dataChannel2 = context.LJIIIIZZ;
        if (dataChannel2 == null || (c19690px = (C19690px) dataChannel2.kv0(C54812Dd.class)) == null || !c19690px.LIZ) {
            return;
        }
        DataChannel dataChannel3 = context.LJIIIIZZ;
        if ((dataChannel3 != null && o.LJ(dataChannel3.kv0(GuidanceVisibilityChannel.class), Boolean.TRUE)) || SystemClock.uptimeMillis() - context.LJIILL <= c19690px.LJI) {
            return;
        }
        context.LJIILL = SystemClock.uptimeMillis();
        model.LJJJIL = true;
        User user = model.getUser();
        CQH cqh = new CQH();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = context.LJIIJJI;
        commonMessageData.showMsg = true;
        cqh.baseMessage = commonMessageData;
        CQE cqe = new CQE(user, cqh);
        cqe.LJIJJLI(context);
        cqe.LJLLL();
        User user2 = model.getUser();
        DataChannel dataChannel4 = context.LJIIIIZZ;
        if (dataChannel4 != null && (c19690px3 = (C19690px) dataChannel4.kv0(C54812Dd.class)) != null) {
            Resources resources = context.LIZ.getResources();
            if (c19690px3.LJII) {
                i2 = R.string.ngl;
            } else {
                i2 = R.string.ngk;
            }
            String string = resources.getString(i2);
            o.LJIIIIZZ(string, "publicScreenContext.cont…eebackBanner_commentBody)");
            int LJJLIIIJL = s.LJJLIIIJL(string, "%s", 0, false, 6);
            if (LJJLIIIJL != -1 && (LJIIIIZZ = CXJ.LJIIIIZZ(user2, cqe)) != null) {
                spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.replace(LJJLIIIJL, LJJLIIIJL + 2, LJIIIIZZ);
                int LJIIL = cqe.LJIIL();
                spannableStringBuilder.setSpan(cqe.LJIILJJIL(LJIIL, user2), LJJLIIIJL, LJIIIIZZ.length() + LJJLIIIJL, 34);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(LJIIL), LJJLIIIJL, LJIIIIZZ.length() + LJJLIIIJL, 34);
                CXJ.LJIIIZ(spannableStringBuilder, 0, spannableStringBuilder.length(), cqe, false, -1);
                CQG cqg = new CQG();
                model.getUser();
                cqg.LIZIZ = model.LJJLJ();
                cqg.LIZ = spannableStringBuilder;
                cqe.LJJ = cqg;
                dataChannel = context.LJIIIIZZ;
                if (dataChannel != null && (c19690px2 = (C19690px) dataChannel.kv0(C54812Dd.class)) != null && c19690px2.LIZ && !o.LJ(dataChannel.kv0(GuidanceVisibilityChannel.class), Boolean.TRUE)) {
                    cqe.LJJIFFI = true;
                    CQI cqi = cqe.LJJI;
                    String str = c19690px.LIZLLL;
                    cqi.getClass();
                    o.LJIIIZ(str, "<set-?>");
                    cqi.LIZIZ = str;
                }
                model.LJJJJ = cqe;
            }
        }
        spannableStringBuilder = null;
        CQG cqg2 = new CQG();
        model.getUser();
        cqg2.LIZIZ = model.LJJLJ();
        cqg2.LIZ = spannableStringBuilder;
        cqe.LJJ = cqg2;
        dataChannel = context.LJIIIIZZ;
        if (dataChannel != null) {
            cqe.LJJIFFI = true;
            CQI cqi2 = cqe.LJJI;
            String str2 = c19690px.LIZLLL;
            cqi2.getClass();
            o.LJIIIZ(str2, "<set-?>");
            cqi2.LIZIZ = str2;
        }
        model.LJJJJ = cqe;
    }
}
