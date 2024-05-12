package com.ss.android.ugc.aweme.sticker.image;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class TemplatesPanelModel extends F9E implements Serializable {

    @InterfaceC65349Pkn("default_data")
    public DefaultTemplates defaultTemplates;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplatesPanelModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TemplatesPanelModel copy$default(TemplatesPanelModel templatesPanelModel, DefaultTemplates defaultTemplates, int i, Object obj) {
        if ((i & 1) != 0) {
            defaultTemplates = templatesPanelModel.defaultTemplates;
        }
        return templatesPanelModel.copy(defaultTemplates);
    }

    public final TemplatesPanelModel copy(DefaultTemplates defaultTemplates) {
        return new TemplatesPanelModel(defaultTemplates);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.defaultTemplates};
    }

    public final DefaultTemplates getDefaultTemplates() {
        return this.defaultTemplates;
    }

    public TemplatesPanelModel(DefaultTemplates defaultTemplates) {
        this.defaultTemplates = defaultTemplates;
    }

    public final void setDefaultTemplates(DefaultTemplates defaultTemplates) {
        this.defaultTemplates = defaultTemplates;
    }

    public /* synthetic */ TemplatesPanelModel(DefaultTemplates defaultTemplates, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : defaultTemplates);
    }
}
