package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6Y extends F9E {
    public final L61 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final L6O LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public final ConcurrentHashMap<String, MutableLiveData<C53710L6c>> L() {
        return (ConcurrentHashMap) this.LJLJI.getValue();
    }

    public final ConcurrentHashMap<String, C53710L6c> M() {
        return (ConcurrentHashMap) this.LJLILLLLZI.getValue();
    }

    public L6Y(L61 bizTag) {
        o.LJIIIZ(bizTag, "bizTag");
        this.LJLIL = bizTag;
        this.LJLILLLLZI = C221108m2.LIZIZ(C53709L6b.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(L6Z.LJLIL);
        this.LJLJJI = L60.LIZ(bizTag);
    }

    public final C53710L6c N(String uid, C53710L6c userSocialStatus, Boolean bool) {
        long j;
        boolean z;
        Integer num;
        Long l;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(userSocialStatus, "userSocialStatus");
        if (userSocialStatus.LIZ == -1) {
            return userSocialStatus;
        }
        C53710L6c c53710L6c = M().get(uid);
        if (c53710L6c != null && (l = c53710L6c.LIZJ) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (c53710L6c != null) {
            z = o.LJ(c53710L6c.LIZIZ, Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            Boolean bool2 = Boolean.TRUE;
            if ((o.LJ(bool, bool2) || !o.LJ(userSocialStatus.LIZIZ, bool2)) && System.currentTimeMillis() - j < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                C189837ch.LIZ("story-avatar", "last time is local, and now is bind");
                return c53710L6c;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ready update: status: ");
        LIZ.append(userSocialStatus.LIZ);
        LIZ.append(", fromBind: ");
        LIZ.append(bool);
        LIZ.append(", preUserSocialStatus ");
        if (c53710L6c != null) {
            num = Integer.valueOf(c53710L6c.LIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        C189837ch.LIZ("story-avatar", X1D.LIZIZ(LIZ));
        if (c53710L6c == null || userSocialStatus.LIZ != c53710L6c.LIZ) {
            M().put(uid, userSocialStatus);
            MutableLiveData<C53710L6c> mutableLiveData = L().get(uid);
            if (mutableLiveData != null) {
                mutableLiveData.postValue(userSocialStatus);
            }
        }
        return userSocialStatus;
    }
}
