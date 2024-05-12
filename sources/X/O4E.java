package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import java.io.File;

/* loaded from: classes11.dex */
public final class O4E {
    public static File LIZ() {
        File file = CDNFetcher.directory;
        if (file == null) {
            file = new File(Forest.Companion.getApp().getCacheDir(), "rl_resource_offline");
        }
        file.mkdirs();
        CDNFetcher.directory = file;
        return file;
    }
}
