package X;

import Y.ACListenerS40S0200000_5;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostListReservationButtonColorOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TuJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76131TuJ extends C78948Uye {
    public static void LJIL(InterfaceC76134TuM holder, C75981Trt item) {
        long j;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        if (!C76117Tu5.LIZ()) {
            return;
        }
        C47121t6 LJJLIIIJ = holder.LJJLIIIJ();
        if (LJJLIIIJ != null) {
            C29306Beo.LJJLJLI(LJJLIIIJ);
        }
        C47121t6 LLIIIJ = holder.LLIIIJ();
        if (LLIIIJ != null) {
            C29306Beo.LJJLJLI(LLIIIJ);
        }
        Room room = item.LJLIL;
        if (room != null) {
            j = C44432HcC.LJIIL(room);
        } else {
            j = 0;
        }
        if (j == 0) {
            C47121t6 LJJLIIIJ2 = holder.LJJLIIIJ();
            if (LJJLIIIJ2 != null) {
                LJJLIIIJ2.setText("");
            }
        } else {
            C47121t6 LJJLIIIJ3 = holder.LJJLIIIJ();
            if (LJJLIIIJ3 != null) {
                LJJLIIIJ3.setText("I");
            }
        }
        Room room2 = item.LJLIL;
        if (room2 == null || C44432HcC.LJIIJJI(room2) == 0) {
            C47121t6 LLIIIJ2 = holder.LLIIIJ();
            if (LLIIIJ2 == null) {
                return;
            }
            LLIIIJ2.setText("");
            return;
        }
        C47121t6 LLIIIJ3 = holder.LLIIIJ();
        if (LLIIIJ3 == null) {
            return;
        }
        LLIIIJ3.setText("G");
    }

    public static boolean LJJ(InterfaceC76134TuM holder, C75981Trt item) {
        List<UserInfo> list;
        LinkerInfo linkerInfo;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        RivalExtraInfo rivalExtraInfo = item.LJLJJI;
        if (rivalExtraInfo != null && (linkerInfo = rivalExtraInfo.linkerInfo) != null) {
            list = linkerInfo.linkedUsers;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i = 0;
        for (UserInfo userInfo : list) {
            int i2 = i + 1;
            if (i >= 0) {
                UserInfo userInfo2 = userInfo;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            CX5 LLJJJJ = holder.LLJJJJ();
                            if (LLJJJJ != null) {
                                LLJJJJ.setAvatar(userInfo2.anchorAvatar);
                            }
                            CX5 LLJJJJ2 = holder.LLJJJJ();
                            if (LLJJJJ2 != null) {
                                LLJJJJ2.setVisibility(0);
                            }
                        }
                    } else {
                        CX5 LLILLJJLI = holder.LLILLJJLI();
                        if (LLILLJJLI != null) {
                            LLILLJJLI.setAvatar(userInfo2.anchorAvatar);
                        }
                        CX5 LLILLJJLI2 = holder.LLILLJJLI();
                        if (LLILLJJLI2 != null) {
                            LLILLJJLI2.setVisibility(0);
                        }
                        CX5 LLJJJJ3 = holder.LLJJJJ();
                        if (LLJJJJ3 != null) {
                            LLJJJJ3.setVisibility(8);
                        }
                    }
                } else {
                    CX5 LLILZ = holder.LLILZ();
                    if (LLILZ != null) {
                        LLILZ.setAvatar(userInfo2.anchorAvatar);
                    }
                    CX5 LLILZ2 = holder.LLILZ();
                    if (LLILZ2 != null) {
                        LLILZ2.setVisibility(0);
                    }
                    CX5 LLILLJJLI3 = holder.LLILLJJLI();
                    if (LLILLJJLI3 != null) {
                        LLILLJJLI3.setVisibility(8);
                    }
                    CX5 LLJJJJ4 = holder.LLJJJJ();
                    if (LLJJJJ4 != null) {
                        LLJJJJ4.setVisibility(8);
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return true;
    }

    public static boolean LJJIFFI(InterfaceC76134TuM holder, C75981Trt item) {
        String str;
        CohostTopic cohostTopic;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        RoomLinkInfo linkMicInfo = item.LJLIL.getLinkMicInfo();
        String str2 = null;
        if (linkMicInfo != null && (cohostTopic = linkMicInfo.topicInfo) != null) {
            str = cohostTopic.titleKey;
        } else {
            str = null;
        }
        if (C29306Beo.LJIJJLI(str)) {
            C47121t6 LLZZZIL = holder.LLZZZIL();
            if (LLZZZIL == null) {
                return true;
            }
            C86881Y7x LIZIZ = C86881Y7x.LIZIZ();
            CohostTopic cohostTopic2 = item.LJLIL.getLinkMicInfo().topicInfo;
            if (cohostTopic2 != null) {
                str2 = cohostTopic2.titleKey;
            }
            LLZZZIL.setText(LIZIZ.LIZ(str2));
            return true;
        }
        return false;
    }

    public static void LJJII(InterfaceC76134TuM holder, C75981Trt item, boolean z) {
        C31597Caf LLLLIILLL;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        User owner = item.LJLIL.getOwner();
        if (!z && (LLLLIILLL = holder.LLLLIILLL()) != null) {
            C31665Cbl.LJIIJ(LLLLIILLL, owner.getAvatarThumb(), LLLLIILLL.getWidth(), LLLLIILLL.getHeight(), R.drawable.cuk);
            C16880lQ.LJJIJIIJI(LLLLIILLL, new ACListenerS40S0200000_5(item, owner, 92));
        }
    }

    public static void LJJI(String str, InterfaceC76134TuM holder, int i, boolean z) {
        o.LJIIIZ(holder, "holder");
        ViewGroup LJJIII = holder.LJJIII();
        if (LJJIII != null) {
            LJJIII.setVisibility(0);
        }
        C47121t6 LJJJJL = holder.LJJJJL();
        if (LJJJJL != null) {
            LJJJJL.setVisibility(0);
        }
        C47121t6 LJJJJL2 = holder.LJJJJL();
        if (LJJJJL2 != null) {
            LJJJJL2.setText(str);
        }
        if (CoHostListReservationButtonColorOptSetting.INSTANCE.isEnable() && z) {
            C41081jM LLZILL = holder.LLZILL();
            if (LLZILL != null) {
                LLZILL.setBackgroundResource(R.drawable.cl1);
            }
        } else {
            C41081jM LLZILL2 = holder.LLZILL();
            if (LLZILL2 != null) {
                LLZILL2.setBackgroundResource(R.drawable.cl0);
            }
        }
        C018905p c018905p = new C018905p(0, -2);
        if (i <= 1) {
            c018905p.bottomToBottom = R.id.f5n;
            c018905p.topToTop = R.id.f5n;
            c018905p.startToEnd = R.id.f5n;
            c018905p.endToEnd = 0;
            c018905p.setMarginStart(C15380j0.LIZ(12.0f));
            c018905p.setMarginEnd(C15380j0.LIZ(0.0f));
            ViewGroup j = holder.j();
            if (j != null) {
                j.setLayoutParams(c018905p);
            }
            C018905p c018905p2 = new C018905p(-1, -2);
            c018905p2.topToBottom = R.id.f5n;
            ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = C15380j0.LIZ(4.0f);
            c018905p2.setMarginStart(C15380j0.LIZ(16.0f));
            c018905p2.setMarginEnd(C15380j0.LIZ(16.0f));
            c018905p2.startToStart = 0;
            c018905p2.endToEnd = 0;
            ViewGroup LJJIII2 = holder.LJJIII();
            if (LJJIII2 == null) {
                return;
            }
            LJJIII2.setLayoutParams(c018905p2);
            return;
        }
        c018905p.bottomToBottom = -1;
        c018905p.startToEnd = R.id.f5n;
        c018905p.topToTop = 0;
        c018905p.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C15380j0.LIZ(10.0f);
        c018905p.setMarginEnd(C15380j0.LIZ(0.0f));
        c018905p.setMarginStart(C15380j0.LIZ(12.0f));
        ViewGroup j2 = holder.j();
        if (j2 == null) {
            return;
        }
        j2.setLayoutParams(c018905p);
    }
}
