package X;

import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* loaded from: classes14.dex */
public final class V2W extends AbstractC65781Prl implements InterfaceC65784Pro<PreviewHintComponent> {
    public static final V2W LJLIL = new V2W();

    public V2W() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PreviewHintComponent invoke() {
        return new PreviewHintComponent(new TextComponent(""), new TextComponent(""), new TextComponent(""), null, null);
    }
}
