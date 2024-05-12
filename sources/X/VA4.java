package X;

/* loaded from: classes14.dex */
public interface VA4 extends InterfaceC39538FfS {
    void cancelPreloadMedia(String str, String str2);

    O3S fetchResourceAsync(String str, O3M o3m, O3R o3r);

    InterfaceC79289V9x fetchResourceSync(String str, O3M o3m);

    String geckoResourcePathForUrlString(String str);

    int isGeckoResource(String str);

    void preload(String str, O3M o3m);

    void preloadMedia(String str, String str2, String str3, long j);
}
