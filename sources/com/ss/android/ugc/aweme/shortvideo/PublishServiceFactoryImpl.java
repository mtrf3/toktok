package com.ss.android.ugc.aweme.shortvideo;

import X.GVW;
import com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishServiceFactoryImpl implements IPublishServiceFactory {
    @Override // com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    public final GVW LIZ(int i, BaseShortVideoContext args) {
        o.LJIIIZ(args, "args");
        if (i != 0 && i != 11) {
            return null;
        }
        return new GVW(i, args);
    }
}
