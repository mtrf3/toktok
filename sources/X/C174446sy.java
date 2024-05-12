package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174446sy {
    public static final java.util.Map<String, C174456sz> LIZ = new HashMap();

    public static Comment LIZ(String str) {
        C174456sz c174456sz = (C174456sz) ((HashMap) LIZ).get(str);
        if (c174456sz != null) {
            return c174456sz.LIZIZ;
        }
        return null;
    }

    public static int LIZIZ(Comment comment) {
        if (comment == null) {
            return -1;
        }
        C174456sz c174456sz = (C174456sz) ((HashMap) LIZ).get(comment.getFakeId());
        if (c174456sz == null) {
            return -1;
        }
        return c174456sz.LIZJ;
    }

    public static AbstractC176686wa LIZJ(Comment comment) {
        if (comment == null) {
            return null;
        }
        C174456sz c174456sz = (C174456sz) ((HashMap) LIZ).get(comment.getFakeId());
        if (c174456sz == null) {
            return null;
        }
        return c174456sz.LIZLLL;
    }

    public static boolean LIZLLL(Comment comment) {
        int i;
        if (comment == null) {
            return false;
        }
        C174456sz c174456sz = (C174456sz) ((HashMap) LIZ).get(comment.getFakeId());
        if (c174456sz == null || 1 > (i = c174456sz.LIZ) || i >= 4 || c174456sz.LIZJ < 0) {
            return false;
        }
        return true;
    }

    public static void LJ(Comment comment) {
        String replyToUserId;
        if (comment == null) {
            return;
        }
        HashMap hashMap = (HashMap) LIZ;
        C174456sz c174456sz = (C174456sz) hashMap.get(comment.getFakeId());
        if (c174456sz != null) {
            Comment comment2 = c174456sz.LIZIZ;
            String replyToUserId2 = comment.getReplyToUserId();
            if ((replyToUserId2 == null || replyToUserId2.length() == 0) && comment2 != null && (replyToUserId = comment2.getReplyToUserId()) != null && replyToUserId.length() != 0) {
                comment.setReplyToUserId(comment2.getReplyToUserId());
            }
            String fakeId = comment.getFakeId();
            o.LJIIIIZZ(fakeId, "comment.fakeId");
            hashMap.put(fakeId, C174456sz.LIZ(c174456sz, 0, comment, 0, null, 0, null, 61));
            return;
        }
        String fakeId2 = comment.getFakeId();
        o.LJIIIIZZ(fakeId2, "comment.fakeId");
        hashMap.put(fakeId2, new C174456sz(0, comment, 0, null, 0, null, 61));
    }

    public static void LJFF(Comment comment) {
        C174456sz c174456sz;
        if (comment == null) {
            return;
        }
        java.util.Map<String, C174456sz> map = LIZ;
        String fakeId = comment.getFakeId();
        o.LJIIIIZZ(fakeId, "comment.fakeId");
        HashMap hashMap = (HashMap) map;
        C174456sz c174456sz2 = (C174456sz) hashMap.get(comment.getFakeId());
        if (c174456sz2 != null) {
            c174456sz = C174456sz.LIZ(c174456sz2, 2, null, 0, null, 0, null, 62);
        } else {
            c174456sz = new C174456sz(2, null, 0, null, 0, null, 62);
        }
        hashMap.put(fakeId, c174456sz);
    }

    public static void LJII(Comment comment) {
        C174456sz c174456sz;
        if (comment == null) {
            return;
        }
        java.util.Map<String, C174456sz> map = LIZ;
        String fakeId = comment.getFakeId();
        o.LJIIIIZZ(fakeId, "comment.fakeId");
        HashMap hashMap = (HashMap) map;
        C174456sz c174456sz2 = (C174456sz) hashMap.get(comment.getFakeId());
        if (c174456sz2 != null) {
            c174456sz = C174456sz.LIZ(c174456sz2, 1, null, 0, null, 0, null, 62);
        } else {
            c174456sz = new C174456sz(1, null, 0, null, 0, null, 62);
        }
        hashMap.put(fakeId, c174456sz);
    }

    public static void LJI(Comment comment, int i) {
        C174456sz c174456sz;
        if (comment == null) {
            return;
        }
        java.util.Map<String, C174456sz> map = LIZ;
        String fakeId = comment.getFakeId();
        o.LJIIIIZZ(fakeId, "comment.fakeId");
        HashMap hashMap = (HashMap) map;
        C174456sz c174456sz2 = (C174456sz) hashMap.get(comment.getFakeId());
        if (c174456sz2 != null) {
            c174456sz = C174456sz.LIZ(c174456sz2, 0, null, i, null, 0, null, 59);
        } else {
            c174456sz = new C174456sz(0, null, i, null, 0, null, 59);
        }
        hashMap.put(fakeId, c174456sz);
    }

    public static void LJIIIIZZ(Comment comment, AbstractC176686wa params) {
        C174456sz c174456sz;
        o.LJIIIZ(params, "params");
        if (comment == null) {
            return;
        }
        java.util.Map<String, C174456sz> map = LIZ;
        String fakeId = comment.getFakeId();
        o.LJIIIIZZ(fakeId, "comment.fakeId");
        HashMap hashMap = (HashMap) map;
        C174456sz c174456sz2 = (C174456sz) hashMap.get(comment.getFakeId());
        if (c174456sz2 != null) {
            c174456sz = C174456sz.LIZ(c174456sz2, 0, null, 0, params, 0, null, 55);
        } else {
            c174456sz = new C174456sz(0, null, 0, params, 0, null, 55);
        }
        hashMap.put(fakeId, c174456sz);
    }

    public static void LJIIIZ(Comment comment, int i) {
        C174456sz c174456sz;
        if (comment == null) {
            return;
        }
        java.util.Map<String, C174456sz> map = LIZ;
        String fakeId = comment.getFakeId();
        o.LJIIIIZZ(fakeId, "comment.fakeId");
        HashMap hashMap = (HashMap) map;
        C174456sz c174456sz2 = (C174456sz) hashMap.get(comment.getFakeId());
        if (c174456sz2 != null) {
            c174456sz = C174456sz.LIZ(c174456sz2, 0, null, 0, null, i, null, 47);
        } else {
            c174456sz = new C174456sz(0, null, 0, null, i, null, 47);
        }
        hashMap.put(fakeId, c174456sz);
    }

    public static void LJIIJ(Comment comment, TuxTextView tuxTextView) {
        if (comment == null || tuxTextView == null) {
            return;
        }
        C174456sz c174456sz = (C174456sz) ((HashMap) LIZ).get(comment.getFakeId());
        if (c174456sz == null) {
            tuxTextView.setVisibility(8);
            return;
        }
        if (c174456sz.LIZ == 2) {
            int i = 0;
            tuxTextView.setVisibility(0);
            Context context = tuxTextView.getContext();
            o.LJIIIIZZ(context, "statusView.context");
            Integer LJI = C79045V0n.LJI(R.attr.eb, context);
            if (LJI != null) {
                i = LJI.intValue();
            }
            tuxTextView.setTextColor(i);
            tuxTextView.setText(R.string.dlz);
            return;
        }
        tuxTextView.setVisibility(8);
    }
}
