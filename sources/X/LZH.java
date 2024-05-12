package X;

import android.util.LruCache;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.feed.platform.panel.live.LiveInnerPushComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LZH implements C2MJ {
    public final /* synthetic */ LiveInnerPushComponent LJLIL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public LZH(LiveInnerPushComponent liveInnerPushComponent) {
        this.LJLIL = liveInnerPushComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        EnumC66933QOr enumC66933QOr;
        LiveInnerPushComponent liveInnerPushComponent = this.LJLIL;
        if (liveInnerPushComponent.LJLJI) {
            return;
        }
        long j = 0;
        if (liveInnerPushComponent.LJLILLLLZI > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            LiveInnerPushComponent liveInnerPushComponent2 = this.LJLIL;
            long j2 = currentTimeMillis - liveInnerPushComponent2.LJLILLLLZI;
            if (i > liveInnerPushComponent2.LJLJJL) {
                int i2 = liveInnerPushComponent2.LJLJJI;
                LruCache<Integer, Long> lruCache = liveInnerPushComponent2.LJLJJLL;
                if (lruCache != null) {
                    if (i2 >= lruCache.size()) {
                        LiveInnerPushComponent liveInnerPushComponent3 = this.LJLIL;
                        LruCache<Integer, Long> lruCache2 = liveInnerPushComponent3.LJLJJLL;
                        if (lruCache2 != null) {
                            lruCache2.put(Integer.valueOf(liveInnerPushComponent3.LJLJJI), Long.valueOf(j2));
                            LiveInnerPushComponent liveInnerPushComponent4 = this.LJLIL;
                            if (!liveInnerPushComponent4.LJLJI) {
                                if (C35154Dqw.LIZ()) {
                                    enumC66933QOr = C67128QWe.LIZIZ.getState();
                                } else {
                                    enumC66933QOr = QWY.LJIIIZ.LIZ().LIZLLL;
                                }
                                if (EnumC66933QOr.CONNECTED == enumC66933QOr && BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
                                    LruCache<Integer, Long> lruCache3 = liveInnerPushComponent4.LJLJJLL;
                                    if (lruCache3 != null) {
                                        if (lruCache3.size() >= ((Number) liveInnerPushComponent4.LJLJLJ.getValue()).intValue() && ((Number) liveInnerPushComponent4.LJLJLLL.getValue()).intValue() > 0) {
                                            try {
                                                int intValue = ((Number) liveInnerPushComponent4.LJLJLJ.getValue()).intValue() - 1;
                                                int i3 = liveInnerPushComponent4.LJLJJL;
                                                int i4 = intValue;
                                                while (true) {
                                                    if (-1 >= intValue) {
                                                        break;
                                                    }
                                                    LruCache<Integer, Long> lruCache4 = liveInnerPushComponent4.LJLJJLL;
                                                    if (lruCache4 != null) {
                                                        Long l = lruCache4.get(Integer.valueOf(i3));
                                                        if (l != null) {
                                                            long longValue = l.longValue();
                                                            if (longValue < 0 || longValue >= ((Number) liveInnerPushComponent4.LJLJLLL.getValue()).intValue()) {
                                                                break;
                                                            }
                                                            if (i4 != 0) {
                                                                i3--;
                                                                i4--;
                                                                intValue--;
                                                            } else {
                                                                liveInnerPushComponent4.LJLJI = true;
                                                                LiveOuterService.LJJJLL().LJJIJIL();
                                                                C86393XvR.LLF("lost_focus", new T2R());
                                                                liveInnerPushComponent4.v3();
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    } else {
                                                        o.LJIJI("showTimes");
                                                        throw null;
                                                    }
                                                }
                                            } catch (Exception e) {
                                                ALog.e("LiveInnerPushComponent", e);
                                            }
                                        }
                                    } else {
                                        o.LJIJI("showTimes");
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            o.LJIJI("showTimes");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("showTimes");
                    throw null;
                }
            }
            LiveInnerPushComponent liveInnerPushComponent5 = this.LJLIL;
            LruCache<Integer, Long> lruCache5 = liveInnerPushComponent5.LJLJJLL;
            if (lruCache5 != null) {
                Long l2 = lruCache5.get(Integer.valueOf(liveInnerPushComponent5.LJLJJI));
                if (l2 != null) {
                    j = l2.longValue();
                }
                long j3 = j2 + j;
                LiveInnerPushComponent liveInnerPushComponent6 = this.LJLIL;
                LruCache<Integer, Long> lruCache6 = liveInnerPushComponent6.LJLJJLL;
                if (lruCache6 != null) {
                    lruCache6.put(Integer.valueOf(liveInnerPushComponent6.LJLJJI), Long.valueOf(j3));
                } else {
                    o.LJIJI("showTimes");
                    throw null;
                }
            } else {
                o.LJIJI("showTimes");
                throw null;
            }
        }
        this.LJLIL.LJLILLLLZI = System.currentTimeMillis();
        LiveInnerPushComponent liveInnerPushComponent7 = this.LJLIL;
        liveInnerPushComponent7.LJLJJI = i;
        if (i > liveInnerPushComponent7.LJLJJL) {
            liveInnerPushComponent7.LJLJJL = i;
        }
    }
}
