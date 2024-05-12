package X;

import Y.ARunnableS9S1100000_8;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JCG {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(JCI.LJLIL);
    public final C8RO LIZIZ = new C8RO("play_num");

    public final UserPlayNum LIZ(String str) {
        if (!IFA.LIZ()) {
            return new UserPlayNum(str, new FeedPlayNumModel(0, 0, 0, 0, 0, 0, 0L, Calendar.getInstance().get(6)));
        }
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        String string = ((Keva) value).getString(str, "");
        if (string == null || string.length() == 0) {
            return JCH.LIZ(str);
        }
        try {
            Object LJI = GsonHolder.LIZLLL().LIZ().LJI(string, FeedPlayNumModel.class);
            o.LJIIIIZZ(LJI, "get().gson.fromJson(stor…PlayNumModel::class.java)");
            UserPlayNum userPlayNum = new UserPlayNum(str, (FeedPlayNumModel) LJI);
            if (Calendar.getInstance().get(6) != userPlayNum.getModel().getDate()) {
                userPlayNum.getModel().setPlayNum(0);
                userPlayNum.getModel().setBatchNum(0);
                userPlayNum.getModel().setRecommendPlayNum(0);
                userPlayNum.getModel().setRecommendBatchNum(0);
                userPlayNum.getModel().setPlayTimeBefore(0L);
                userPlayNum.getModel().setDate(Calendar.getInstance().get(6));
            }
            return userPlayNum;
        } catch (Exception unused) {
            if (IFA.LIZ()) {
                new ARunnableS9S1100000_8(this, str, 5).run();
            }
            this.LIZIZ.LJI(JCJ.LJLIL);
            return JCH.LIZ(str);
        }
    }

    public final void LIZIZ(UserPlayNum playCount) {
        o.LJIIIZ(playCount, "playCount");
        if (!IFA.LIZ()) {
            return;
        }
        try {
            String LJIILL = GsonHolder.LIZLLL().LIZ().LJIILL(playCount.getModel());
            Object value = this.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            ((Keva) value).storeString(playCount.getUid(), LJIILL);
        } catch (Exception unused) {
            this.LIZIZ.LJI(JCK.LJLIL);
        }
    }
}
