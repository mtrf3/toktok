package com.ss.android.ugc.aweme.services.editeffect;

import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class FetchEffectState {

    /* loaded from: classes3.dex */
    public static final class INIT extends FetchEffectState {
        public static final INIT INSTANCE = new INIT();
    }

    /* loaded from: classes3.dex */
    public static final class LOADING extends FetchEffectState {
        public static final LOADING INSTANCE = new LOADING();
    }

    public /* synthetic */ FetchEffectState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* loaded from: classes3.dex */
    public static final class ERROR extends FetchEffectState {
        public final int code;
        public final String message;

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public ERROR(int i, String str) {
            this.code = i;
            this.message = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SUCCESS extends FetchEffectState {
        public final List<EditEffectAnchorInfo> data;

        public final List<EditEffectAnchorInfo> getData() {
            return this.data;
        }

        public SUCCESS(List<EditEffectAnchorInfo> data) {
            o.LJIIIZ(data, "data");
            this.data = data;
        }
    }

    public FetchEffectState() {
    }
}
