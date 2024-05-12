package X;

import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;

/* loaded from: classes9.dex */
public final class IHH extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, Object, Boolean> {
    public static final IHH LJLIL = new IHH();

    public IHH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Integer num, Object obj) {
        num.intValue();
        return Boolean.valueOf(obj instanceof DiscoverSectionItem.TrendingTopicOrAdSection);
    }
}
