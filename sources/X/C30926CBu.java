package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.CBu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30926CBu {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public User LIZLLL;
    public final String LJ;
    public final List<EmoteWithIndex> LJFF;
    public String LJI;
    public final boolean LJII;
    public String LJIIIIZZ;
    public ISendCommentEvent.Sender LJIIIZ;
    public EmoteModel LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public final JSONObject LJIILIIL;
    public String LJIILJJIL;

    public C30926CBu() {
        this(0, "");
    }

    public C30926CBu(int i, String str) {
        this(i, str, "", false);
    }

    public C30926CBu(String str, String str2, String str3, List list) {
        this.LJII = true;
        this.LIZ = 1;
        this.LIZIZ = str;
        this.LJI = str2;
        this.LIZJ = false;
        this.LJ = str3;
        this.LJFF = list;
    }

    public C30926CBu(int i, String str, String str2, JSONObject jSONObject) {
        this.LJII = true;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LJI = str2;
        this.LIZJ = false;
        this.LJIILIIL = jSONObject;
    }

    public C30926CBu(int i, String str, String str2, boolean z) {
        this.LJII = true;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LJI = str2;
        this.LIZJ = z;
    }
}
