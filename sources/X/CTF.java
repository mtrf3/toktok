package X;

import X.CR6;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class CTF<MESSAGE extends CR6> extends CQO<MESSAGE> {
    public void LLFF() {
    }

    public String LLFFF() {
        return "#ff4e33";
    }

    public abstract void LLFII();

    public void LLFZ() {
    }

    public void LLI() {
    }

    public abstract ImageModel LLIFFJFJJ();

    public abstract boolean LLII();

    public User getUser() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTF(MESSAGE message) {
        super(message);
        o.LJIIIZ(message, "message");
    }
}
