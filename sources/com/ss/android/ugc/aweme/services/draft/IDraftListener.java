package com.ss.android.ugc.aweme.services.draft;

import X.C48339Iy7;
import X.X1D;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public interface IDraftListener {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onDeleted(IDraftListener iDraftListener, AwemeDraft draft) {
            o.LJIIIZ(draft, "draft");
        }

        public static void onUpdated(IDraftListener iDraftListener, UpdateParams params) {
            o.LJIIIZ(params, "params");
        }
    }

    void onDeleted(AwemeDraft awemeDraft);

    void onUpdated(UpdateParams updateParams);

    /* loaded from: classes2.dex */
    public static final class UpdateParams {
        public final AwemeDraft draft;
        public final boolean isPublish;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public UpdateParams(AwemeDraft draft) {
            this(draft, false, 2, null);
            o.LJIIIZ(draft, "draft");
        }

        public static /* synthetic */ UpdateParams copy$default(UpdateParams updateParams, AwemeDraft awemeDraft, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                awemeDraft = updateParams.draft;
            }
            if ((i & 2) != 0) {
                z = updateParams.isPublish;
            }
            return updateParams.copy(awemeDraft, z);
        }

        public final UpdateParams copy(AwemeDraft draft, boolean z) {
            o.LJIIIZ(draft, "draft");
            return new UpdateParams(draft, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateParams)) {
                return false;
            }
            UpdateParams updateParams = (UpdateParams) obj;
            return o.LJ(this.draft, updateParams.draft) && this.isPublish == updateParams.isPublish;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.draft.hashCode() * 31;
            boolean z = this.isPublish;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UpdateParams(draft=");
            LIZ.append(this.draft);
            LIZ.append(", isPublish=");
            return C48339Iy7.LIZJ(LIZ, this.isPublish, ')', LIZ);
        }

        public final AwemeDraft getDraft() {
            return this.draft;
        }

        public final boolean isPublish() {
            return this.isPublish;
        }

        public UpdateParams(AwemeDraft draft, boolean z) {
            o.LJIIIZ(draft, "draft");
            this.draft = draft;
            this.isPublish = z;
        }

        public /* synthetic */ UpdateParams(AwemeDraft awemeDraft, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(awemeDraft, (i & 2) != 0 ? false : z);
        }
    }
}
