package com.bytedance.hybrid.spark.schema;

import X.C16880lQ;
import X.C1FJ;
import X.C221108m2;
import X.C25620zW;
import X.C37682Eqc;
import X.C39927Flj;
import X.C5H3;
import X.C78926UyI;
import X.E7I;
import X.E7J;
import X.UPJ;
import X.X1D;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class SchemaBundle {
    public static final E7J Companion = new E7J();
    public boolean hasUncommittedChanges;
    public final C5H3 innerBundles$delegate;
    public boolean isChanged;
    public String name;
    public final String originalUrl;
    public SchemaBundle outerBundle;
    public final C5H3 queries$delegate;
    public final SparkContext sparkContext;
    public Uri uri;
    public final C5H3 uriBuilder$delegate;
    public String url;

    private final Map<String, SchemaBundle> getInnerBundles() {
        return (Map) this.innerBundles$delegate.getValue();
    }

    private final Map<String, String> getQueries() {
        return (Map) this.queries$delegate.getValue();
    }

    private final Uri.Builder getUriBuilder() {
        return (Uri.Builder) this.uriBuilder$delegate.getValue();
    }

    public final void commit() {
        C37682Eqc.LIZIZ(this.sparkContext, "SchemaBundle", "commit");
        if (!this.hasUncommittedChanges) {
            return;
        }
        getUriBuilder().clearQuery();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : getQueries().entrySet()) {
            sb.append((String) C1FJ.LIZJ(sb, entry.getKey(), "=", entry));
            sb.append("&");
        }
        getUriBuilder().encodedQuery(s.LJJZZI(sb, "&").toString());
        Uri build = getUriBuilder().build();
        o.LJFF(build, "uriBuilder.build()");
        this.uri = build;
        String uri = build.toString();
        o.LJFF(uri, "uri.toString()");
        this.url = uri;
        SchemaBundle schemaBundle = this.outerBundle;
        if (schemaBundle != null) {
            String str = this.name;
            if (str != null) {
                schemaBundle.commitByInner(this, str);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        this.hasUncommittedChanges = false;
    }

    public final String getPath() {
        return this.uri.getPath();
    }

    public final SchemaBundle getUrlBundle() {
        SchemaBundle queryAsSchemaBundle = getQueryAsSchemaBundle("url");
        if (queryAsSchemaBundle != null) {
            return queryAsSchemaBundle;
        }
        SchemaBundle queryAsSchemaBundle2 = getQueryAsSchemaBundle("surl");
        if (queryAsSchemaBundle2 != null) {
            return queryAsSchemaBundle2;
        }
        return getQueryAsSchemaBundle("res_url");
    }

    public int hashCode() {
        return C16880lQ.LLJILJIL(this.hasUncommittedChanges) + (this.url.hashCode() * 31);
    }

    public final boolean isUrlChanged() {
        SchemaBundle schemaBundle = getInnerBundles().get("url");
        if (schemaBundle == null) {
            schemaBundle = getInnerBundles().get("surl");
        }
        if (schemaBundle == null) {
            schemaBundle = getInnerBundles().get("res_url");
        }
        if (schemaBundle != null && schemaBundle.isChanged) {
            return true;
        }
        String LJJJJI = C78926UyI.LJJJJI(this.uri, "url");
        if (LJJJJI == null && (LJJJJI = C78926UyI.LJJJJI(this.uri, "surl")) == null) {
            LJJJJI = C78926UyI.LJJJJI(this.uri, "res_url");
        }
        if (!o.LJ(LJJJJI, this.originalUrl)) {
            return true;
        }
        return false;
    }

    public final SparkContext getSparkContext() {
        return this.sparkContext;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isChanged() {
        return this.isChanged;
    }

    private final SchemaBundle getQueryAsSchemaBundle(String str) {
        SchemaBundle schemaBundle = getInnerBundles().get(str);
        if (schemaBundle != null) {
            return schemaBundle;
        }
        String decode = Uri.decode(getQueryParameter(str));
        if (decode != null) {
            SchemaBundle schemaBundle2 = new SchemaBundle(this, str, decode, this.sparkContext);
            getInnerBundles().put(str, schemaBundle2);
            return schemaBundle2;
        }
        return null;
    }

    public final void deleteQuery(String key) {
        o.LJIIJ(key, "key");
        C37682Eqc.LIZIZ(this.sparkContext, "SchemaBundle", a1.LJ("key ", key, " is deleted"));
        if (getInnerBundles().get(key) != null) {
            getInnerBundles().remove(key);
        }
        this.hasUncommittedChanges = true;
        this.isChanged = true;
        getQueries().remove(key);
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (!(obj instanceof SchemaBundle)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        SchemaBundle schemaBundle = (SchemaBundle) obj2;
        if (schemaBundle == null || schemaBundle.hasUncommittedChanges || this.hasUncommittedChanges) {
            return super.equals(obj);
        }
        if (getQueries().size() != schemaBundle.getQueries().size()) {
            return false;
        }
        Iterator<Map.Entry<String, String>> it = getQueries().entrySet().iterator();
        while (it.hasNext()) {
            Uri parse = UriProtector.parse(Uri.decode(it.next().getValue()));
            o.LJFF(parse, "Uri.parse(decodedValue)");
            if (parse.isHierarchical()) {
                if (!o.LJ(getQueryAsSchemaBundle(r3.getKey()), schemaBundle.getQueryAsSchemaBundle(r3.getKey()))) {
                    return false;
                }
            } else if (!o.LJ(r3.getValue(), schemaBundle.getQueryParameter(r3.getKey()))) {
                return false;
            }
        }
        return o.LJ(C39927Flj.LIZJ(this.uri), C39927Flj.LIZJ(schemaBundle.uri));
    }

    public final String getQueryParameter(String key) {
        o.LJIIJ(key, "key");
        return getQueries().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, String> resetQuery(Map<String, String> map) {
        map.clear();
        String encodedQuery = this.uri.getEncodedQuery();
        if (encodedQuery != null) {
            Iterator it = s.LJLJJL(encodedQuery, new String[]{"&"}, 0, 6).iterator();
            while (it.hasNext()) {
                List LJLJJL = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6);
                if (LJLJJL.size() == 2) {
                    map.put(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1));
                }
            }
        }
        return map;
    }

    public final void setPath(String path) {
        o.LJIIJ(path, "path");
        C37682Eqc.LIZIZ(this.sparkContext, "SchemaBundle", a1.LJ("path ", path, " is set"));
        this.hasUncommittedChanges = true;
        this.isChanged = true;
        getUriBuilder().path(path);
    }

    public final void setUrl(String url) {
        o.LJIIJ(url, "url");
        C37682Eqc.LIZIZ(this.sparkContext, "SchemaBundle", a1.LJ("url ", url, " is set"));
        this.url = url;
        Uri parse = UriProtector.parse(url);
        o.LJFF(parse, "Uri.parse(url)");
        this.uri = parse;
        getUriBuilder().clearQuery();
        getUriBuilder().scheme(this.uri.getScheme()).authority(this.uri.getAuthority()).path(this.uri.getPath()).query(this.uri.getQuery()).fragment(this.uri.getFragment());
        resetQuery(getQueries());
        getInnerBundles().clear();
        SchemaBundle schemaBundle = this.outerBundle;
        if (schemaBundle != null) {
            String str = this.name;
            if (str != null) {
                schemaBundle.commitByInner(this, str);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        this.hasUncommittedChanges = false;
        this.isChanged = true;
    }

    public SchemaBundle(String url, SparkContext sparkContext) {
        o.LJIIJ(url, "url");
        this.url = url;
        this.sparkContext = sparkContext;
        Uri parse = UriProtector.parse(url);
        o.LJFF(parse, "Uri.parse(url)");
        this.uri = parse;
        String LJJJJI = C78926UyI.LJJJJI(parse, "url");
        if (LJJJJI == null && (LJJJJI = C78926UyI.LJJJJI(this.uri, "surl")) == null) {
            LJJJJI = C78926UyI.LJJJJI(this.uri, "res_url");
        }
        this.originalUrl = LJJJJI;
        this.uriBuilder$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 12));
        this.innerBundles$delegate = C221108m2.LIZIZ(E7I.LJLIL);
        this.queries$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 11));
    }

    private final void commitByInner(SchemaBundle schemaBundle, String str) {
        if (getInnerBundles().get(str) == null) {
            return;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("key ", str, ", value: ");
        LIZIZ.append(schemaBundle.getUrl());
        LIZIZ.append(" is appended");
        C37682Eqc.LIZIZ(this.sparkContext, "SchemaBundle", X1D.LIZIZ(LIZIZ));
        this.hasUncommittedChanges = true;
        this.isChanged = true;
        Map<String, String> queries = getQueries();
        String encode = Uri.encode(schemaBundle.getUrl());
        o.LJFF(encode, "Uri.encode(schemaBundle.getUrl())");
        queries.put(str, encode);
        commit();
    }

    public final void appendQueryParameter(String key, String value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        C37682Eqc.LIZIZ(this.sparkContext, "SchemaBundle", UPJ.LIZIZ("key ", key, ", value: ", value, " is appended"));
        if (getInnerBundles().get(key) != null) {
            getInnerBundles().remove(key);
        }
        this.isChanged = true;
        this.hasUncommittedChanges = true;
        getQueries().put(key, value);
    }

    public SchemaBundle(SchemaBundle schemaBundle, String str, String str2, SparkContext sparkContext) {
        this(str2, sparkContext);
        this.outerBundle = schemaBundle;
        this.name = str;
    }
}
