package X;

import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteBlobTooBigException;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import defpackage.b1;
import defpackage.i0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPD {
    public static final void LJI() {
        if (C00F.LIZ(31744, -1, "studio_size_of_cursor_window", true) <= 0) {
            return;
        }
        FFL.LJIIIZ().getClass();
        int LJIIJ = FFL.LJIIJ(31744, -1, "studio_size_of_cursor_window", true) * 1024 * 1024;
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue == LJIIJ) {
                return;
            }
            declaredField.set(null, Integer.valueOf(LJIIJ));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DraftDBExt -> Resize cursor window size successful! Resize form :");
            LIZ.append(intValue);
            LIZ.append("to ");
            LIZ.append(LJIIJ);
            H78.LIZ(X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DraftDBExt -> refect resize cursor error:");
            LIZ2.append(android.util.Log.getStackTraceString(e));
            H78.LIZJ(X1D.LIZIZ(LIZ2));
        }
    }

    public static final int LIZ(Cursor cursor) {
        o.LJIIIZ(cursor, "<this>");
        try {
            return cursor.getCount();
        } catch (SQLiteBlobTooBigException unused) {
            LJI();
            return cursor.getCount();
        }
    }

    public static final boolean LIZIZ(Cursor cursor) {
        o.LJIIIZ(cursor, "<this>");
        try {
            return cursor.moveToNext();
        } catch (SQLiteBlobTooBigException unused) {
            LJI();
            return cursor.moveToNext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AwemeDraft LIZJ(GPE gpe) {
        C68322mC c68322mC = new C68322mC();
        GPE gpe2 = new GPE(gpe.LJLIL, gpe.LJLILLLLZI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" where video_path = '");
        LIZ.append(gpe2.LJLIL.getCreationId());
        LIZ.append('\'');
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (gpe2.LJLILLLLZI) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, " and user_id = '");
            LIZJ.append(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            LIZJ.append('\'');
            LIZIZ = X1D.LIZIZ(LIZJ);
        }
        LJFF(i0.LJFF("select * from local_draft", LIZIZ), new AqS173S0100000_7(c68322mC, (C68322mC<AwemeDraft>) 399));
        return (AwemeDraft) c68322mC.element;
    }

    public static final int LIZLLL(GPG gpg) {
        C76732zl c76732zl = new C76732zl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select count(video_path) from local_draft");
        LIZ.append(GPF.LIZLLL(gpg, GPF.LIZJ(gpg)));
        LJFF(X1D.LIZIZ(LIZ), new AqS173S0100000_7(c76732zl, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        return c76732zl.element;
    }

    public static final List<AwemeDraft> LJ(GPG gpg, InterfaceC88472Yns<? super AwemeDraft, Boolean> interfaceC88472Yns) {
        ArrayList arrayList = new ArrayList();
        LJFF(GPF.LIZ(gpg), new AqS138S0200000_7(interfaceC88472Yns, (InterfaceC88472Yns<? super AwemeDraft, Boolean>) arrayList, (List<AwemeDraft>) 108));
        return arrayList;
    }

    public static final <T> void LJFF(String sql, InterfaceC88472Yns<? super Cursor, ? extends T> block) {
        o.LJIIIZ(sql, "sql");
        o.LJIIIZ(block, "block");
        try {
            LJII(SQLiteHelper.getInstance().getReadableDatabase().rawQuery(sql, null), block);
        } catch (Exception e) {
            H78.LIZLLL("DraftDBExt", e);
            if (e instanceof SQLiteBlobTooBigException) {
                LJI();
            }
        }
    }

    public static final <T> void LJII(Cursor cursor, InterfaceC88472Yns<? super Cursor, ? extends T> interfaceC88472Yns) {
        if (cursor == null) {
            H78.LIZLLL("DraftDBExt", new RuntimeException("cursor is null !!!"));
            return;
        }
        try {
            if (LIZ(cursor) <= 0) {
                H78.LIZLLL("DraftDBExt", new RuntimeException("cursor's count is <= 0 !!!"));
                return;
            }
            try {
                interfaceC88472Yns.invoke(cursor);
            } catch (Exception e) {
                H78.LIZLLL("DraftDBExt", e);
                if (e instanceof SQLiteBlobTooBigException) {
                    LJI();
                }
            }
        } finally {
            cursor.close();
        }
    }
}
