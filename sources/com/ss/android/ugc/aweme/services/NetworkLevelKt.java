package com.ss.android.ugc.aweme.services;

import X.N4P;
import X.N4Q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NetworkLevelKt {
    public static final N4P defaultNetworkLevel() {
        return new N4P(N4Q.UNDEFINED, -2);
    }

    public static final boolean isDefault(N4P n4p) {
        o.LJIIIZ(n4p, "<this>");
        if (n4p.LJLIL == N4Q.UNDEFINED && n4p.LJLILLLLZI <= -2) {
            return true;
        }
        return false;
    }

    public static final boolean isFake(N4P n4p) {
        o.LJIIIZ(n4p, "<this>");
        if (n4p.LJLIL == N4Q.FAKE) {
            return true;
        }
        return false;
    }

    public static final boolean isOffline(N4P n4p) {
        o.LJIIIZ(n4p, "<this>");
        if (n4p.LJLIL == N4Q.OFFLINE) {
            return true;
        }
        return false;
    }

    public static final boolean isUnknown(N4P n4p) {
        o.LJIIIZ(n4p, "<this>");
        if (n4p.LJLIL == N4Q.UNKNOWN) {
            return true;
        }
        return false;
    }

    public static final boolean isWeak(N4P n4p) {
        o.LJIIIZ(n4p, "<this>");
        if (n4p.LJLIL == N4Q.SLOW) {
            return true;
        }
        return false;
    }

    public static final boolean lteOffline(N4P n4p) {
        o.LJIIIZ(n4p, "<this>");
        if (n4p.LJLILLLLZI <= 1) {
            return true;
        }
        return false;
    }

    public static final N4P obtainNetworkLevelByClientAi(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return new N4P(N4Q.UNDEFINED, i);
                            }
                            return new N4P(N4Q.EXCELLENT, i);
                        }
                        return new N4P(N4Q.MEDERATE, i);
                    }
                    return new N4P(N4Q.SLOW, i);
                }
                return new N4P(N4Q.OFFLINE, i);
            }
            return new N4P(N4Q.UNKNOWN, i);
        }
        return new N4P(N4Q.FAKE, i);
    }

    public static final N4P obtainNetworkLevelByNqe(int i) {
        if (i == -1) {
            return new N4P(N4Q.FAKE, i);
        }
        if (i == 0) {
            return new N4P(N4Q.UNKNOWN, i);
        }
        if (i == 1) {
            return new N4P(N4Q.OFFLINE, i);
        }
        if (i == 2 || i == 3) {
            return new N4P(N4Q.SLOW, i);
        }
        if (i >= 4) {
            return new N4P(N4Q.EXCELLENT, i);
        }
        return new N4P(N4Q.UNDEFINED, i);
    }
}
