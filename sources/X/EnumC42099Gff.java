package X;

/* renamed from: X.Gff, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42099Gff {
    BEFORE_ENTER_RECORD("before_enter_record"),
    ENTER_RECORD("enter_record"),
    ENTER_EDIT("enter_edit"),
    ENTER_PUBLISH("enter_publish"),
    DRAFT_BACK("draft_back"),
    EDIT_DELETE_CLIP("edit_delete_clip"),
    EDIT_PRO_ADJUST_CLIP("edit_prop_adjust_clip"),
    BEFORE_REAL_PUBLISH("before_real_publish"),
    REAL_PUBLISH("real_publish");

    public final String LJLIL;

    public static EnumC42099Gff valueOf(String str) {
        return (EnumC42099Gff) V0N.LJJJ(EnumC42099Gff.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC42099Gff(String str) {
        this.LJLIL = str;
    }
}
