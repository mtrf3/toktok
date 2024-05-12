package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public class CheckUpdateVersionModelTemplate extends CheckUpdateVersionModel {
    public final transient CheckUpdateVersionModel kUpdateModel;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckUpdateVersionModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    public CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel) {
        super(null, null, null, 7, null);
        this.kUpdateModel = checkUpdateVersionModel;
    }

    public /* synthetic */ CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
