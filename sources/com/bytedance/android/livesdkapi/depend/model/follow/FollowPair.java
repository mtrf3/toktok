package com.bytedance.android.livesdkapi.depend.model.follow;

import X.EnumC29290BeY;
import X.InterfaceC65349Pkn;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class FollowPair {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public EnumC29290BeY LIZLLL = EnumC29290BeY.Default;
    public boolean LJ;
    public HashMap<String, String> LJFF;
    public boolean LJI;

    @InterfaceC65349Pkn("follow_status")
    public int followStatus;

    public final int LIZ() {
        int i = this.followStatus;
        if (i < 0 || i > 2) {
            this.followStatus = 0;
        }
        return this.followStatus;
    }

    public final boolean LIZIZ() {
        int i = this.followStatus;
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }
}
