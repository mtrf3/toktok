package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;

/* loaded from: classes7.dex */
public interface F5B {
    ReadableArray asArray();

    boolean asBoolean();

    double asDouble();

    int asInt();

    long asLong();

    ReadableMap asMap();

    String asString();

    ReadableType getType();

    boolean isNull();

    void recycle();
}
