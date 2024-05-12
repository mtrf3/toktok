package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8nT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class EnumC221998nT {
    public static final EnumC221998nT ADDING_TO_STORY;
    public static final EnumC221998nT ADDING_TO_STORY_NO_EDIT;
    public static final /* synthetic */ EnumC221998nT[] LJLJLJ;
    public static final EnumC221998nT UPLOADING;
    public static final EnumC221998nT UPLOAD_FAIL;
    public static final EnumC221998nT UPLOAD_SUCCESS;
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final boolean LJLJL;

    public static EnumC221998nT valueOf(String str) {
        return (EnumC221998nT) V0N.LJJJ(EnumC221998nT.class, str);
    }

    public static EnumC221998nT[] values() {
        return (EnumC221998nT[]) LJLJLJ.clone();
    }

    static {
        EnumC221998nT enumC221998nT = new EnumC221998nT() { // from class: X.8nU
            @Override // X.EnumC221998nT
            public String getText(Context context, float f) {
                o.LJIIIZ(context, "context");
                String string = context.getResources().getString(getTextRes());
                o.LJIIIIZZ(string, "context.resources.getString(textRes)");
                return Q8U.LIZIZ(new Object[]{Integer.valueOf((int) (f * 100))}, 1, string, "format(this, *args)");
            }
        };
        UPLOADING = enumC221998nT;
        EnumC221998nT enumC221998nT2 = new EnumC221998nT() { // from class: X.8nV
            @Override // X.EnumC221998nT
            public String getText(Context context, float f) {
                o.LJIIIZ(context, "context");
                String string = context.getResources().getString(getTextRes());
                o.LJIIIIZZ(string, "context.resources.getString(textRes)");
                return Q8U.LIZIZ(new Object[]{Integer.valueOf((int) (f * 100))}, 1, string, "format(this, *args)");
            }
        };
        ADDING_TO_STORY = enumC221998nT2;
        EnumC221998nT enumC221998nT3 = new EnumC221998nT() { // from class: X.8nW
            @Override // X.EnumC221998nT
            public String getText(Context context, float f) {
                o.LJIIIZ(context, "context");
                String string = context.getResources().getString(getTextRes());
                o.LJIIIIZZ(string, "context.resources.getString(textRes)");
                return Q8U.LIZIZ(new Object[]{Integer.valueOf((int) (f * 100))}, 1, string, "format(this, *args)");
            }
        };
        ADDING_TO_STORY_NO_EDIT = enumC221998nT3;
        EnumC221998nT enumC221998nT4 = new EnumC221998nT("UPLOAD_FAIL", 3, true, R.raw.icon_exclamation_mark_circle_fill, R.string.rr0, true, true, R.attr.gz, false, 64);
        UPLOAD_FAIL = enumC221998nT4;
        EnumC221998nT enumC221998nT5 = new EnumC221998nT("UPLOAD_SUCCESS", 4, true, R.raw.icon_tick_circle_fill, R.string.rr5, false, false, 0, false, 96);
        UPLOAD_SUCCESS = enumC221998nT5;
        LJLJLJ = new EnumC221998nT[]{enumC221998nT, enumC221998nT2, enumC221998nT3, enumC221998nT4, enumC221998nT5};
    }

    public final int getBackgroundColor() {
        return this.LJLJJLL;
    }

    public final int getIconRes() {
        return this.LJLILLLLZI;
    }

    public final boolean getShowEdit() {
        return this.LJLJL;
    }

    public final boolean getShowIcon() {
        return this.LJLIL;
    }

    public final boolean getShowRetry() {
        return this.LJLJJI;
    }

    public final boolean getShowXIcon() {
        return this.LJLJJL;
    }

    public final int getTextRes() {
        return this.LJLJI;
    }

    public String getText(Context context, float f) {
        o.LJIIIZ(context, "context");
        String string = context.getResources().getString(this.LJLJI);
        o.LJIIIIZZ(string, "context.resources.getString(textRes)");
        return string;
    }

    public EnumC221998nT(String str, int i, boolean z, int i2, int i3, boolean z2, boolean z3, int i4, boolean z4, int i5) {
        if ((i5 & 32) != 0) {
            if (C2304092m.LIZ()) {
                i4 = R.attr.d_;
            } else {
                i4 = R.attr.d7;
            }
        }
        z4 = (i5 & 64) != 0 ? false : z4;
        this.LJLIL = z;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = i4;
        this.LJLJL = z4;
    }
}
